package com.adoranwodo.play.Utility

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adoranwodo.play.R
import com.adoranwodo.play.data.Category

/**
 * Inflates a particular layout
 */
fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}


/**
 * Gets the resources for each Category present
 * Resources included are Images, Background Colors and Text Colors
 */
fun Category.resource(): Category {

    val category = this

    when (category.name) {
        "House Arryn" -> return Category(category.name, R.drawable.arryn, R.color.bgArryn, R.color.txtArryn)
        "House Baratheon" -> return Category(category.name, R.drawable.baratheon, R.color.bgBaratheon, R.color.txtBaratheon)
        "House Tarly" -> return Category(category.name, R.drawable.tarly, R.color.bgTarly, R.color.txtTarly)
        "House Lannister" -> return Category(category.name, R.drawable.lannister, R.color.bgLannister, R.color.txtLannister)
        "House Bolton" -> return Category(category.name, R.drawable.bolton, R.color.bgBolton, R.color.txtBolton)
        "House Martell" -> return Category(category.name, R.drawable.martell, R.color.bgMartell, R.color.txtMartell)
        "House Targaryen" -> return Category(category.name, R.drawable.targaryen, R.color.bgTargaryen, R.color.txtTargaryen)
        "House Stark" -> return Category(category.name, R.drawable.stark, R.color.bgStark, R.color.txtStark)
        "House Tully" -> return Category(category.name, R.drawable.tully, R.color.bgTully, R.color.txtTully)
        "House Greyjoy" -> return Category(category.name, R.drawable.greyjoy, R.color.bgGreyjoy, R.color.txtGreyjoy)
        else -> return Category(category.name,0, 0, 0)
    }
}