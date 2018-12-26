package com.adoranwodo.play

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.adoranwodo.play.adapter.CategoryRecyclerAdapter
import com.adoranwodo.play.data.Category
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.content_categories.*

class CategoriesActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: CategoryRecyclerAdapter
    private var categories = arrayListOf<Category>()
    private val db = FirebaseFirestore.getInstance()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager

        getCategories()
    }

    private fun getCategories() {

        db.collection("categories")
        .get()
        .addOnSuccessListener { result ->
            for (document in result) {
                Log.d("FIREBASE RESULTS", document.id + " => " + document.data)
                categories.add(Category(document.data["name"].toString()))
            }
            adapter = CategoryRecyclerAdapter(categories)
            recyclerView.adapter = adapter
            adapter.notifyItemInserted(categories.size)
        }
        .addOnFailureListener { exception ->
            Log.d("FIREBASE ERROR", "Error getting documents.", exception)
        }

    }

}
