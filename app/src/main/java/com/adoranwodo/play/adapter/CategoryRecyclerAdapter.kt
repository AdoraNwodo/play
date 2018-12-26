package com.adoranwodo.play.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.adoranwodo.play.R
import com.adoranwodo.play.Utility.inflate
import com.adoranwodo.play.Utility.resource
import com.adoranwodo.play.data.Category
import kotlinx.android.synthetic.main.category_row.view.*


class CategoryRecyclerAdapter (private val categories: ArrayList<Category>)
    : RecyclerView.Adapter<CategoryRecyclerAdapter.CategoryHolder>()  {

    override fun getItemCount() = categories.size

    override fun onBindViewHolder(holder: CategoryRecyclerAdapter.CategoryHolder, position: Int) {
        val category = categories[position]
        holder.bind(category)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryRecyclerAdapter.CategoryHolder {
        val inflatedView = parent.inflate(R.layout.category_row, false)
        return CategoryHolder(inflatedView)

    }


    class CategoryHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var view: View = v
        private var category: Category? = null


        init {
            v.setOnClickListener(this)
        }


        override fun onClick(v: View) {
            Log.d("RecyclerView", "CLICK!")
            /*
            val context = itemView.context
            val showPhotoIntent = Intent(context, PhotoActivity::class.java)
            showPhotoIntent.putExtra(PHOTO_KEY, photo)
            context.startActivity(showPhotoIntent)
            */

        }

        fun bind(category: Category) {
            this.category = category
            view.itemImage.setImageResource(category.resource().image)

        }


    }

}