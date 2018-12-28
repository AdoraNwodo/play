package com.adoranwodo.play.adapter

import android.graphics.drawable.GradientDrawable
import android.support.v4.content.ContextCompat
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
        private var category: Category = Category("")


        init {
            v.setOnClickListener(this)
        }


        override fun onClick(v: View) {
            Log.d("RecyclerView", "CLICK!")
            /*
            val context = itemView.context
            val showGameActivity = Intent(context, GameActivity::class.java)
            context.startActivity(showGameActivity)
            */

        }

        fun bind(category: Category) {
            this.category = category.resource()
            view.itemImage.setImageResource(this.category.image)
            view.itemBackground.setBackgroundResource(this.category.backgroundColor)
            view.itemText.setTextColor(ContextCompat.getColor(itemView.context, this.category.textColor))
            view.itemText.text = this.category.name


            val gd = GradientDrawable(GradientDrawable.Orientation.TL_BR,
                     intArrayOf(ContextCompat.getColor(itemView.context,android.R.color.darker_gray),
                             ContextCompat.getColor(itemView.context,this.category.backgroundColor)))
            gd.cornerRadius = 0f
            view.itemBackground.background = gd


        }


    }

}