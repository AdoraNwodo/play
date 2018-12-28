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
        "House Arryn" -> return category.update(R.drawable.arryn, R.color.bgArryn, R.color.txtArryn )
        "House Baratheon" -> return category.update(R.drawable.baratheon, R.color.bgBaratheon, R.color.txtBaratheon)
        "House Tarly" -> return category.update(R.drawable.tarly, R.color.bgTarly, R.color.txtTarly)
        "House Lannister" -> return category.update(R.drawable.lannister, R.color.bgLannister, R.color.txtLannister)
        "House Bolton" -> return category.update(R.drawable.bolton, R.color.bgBolton, R.color.txtBolton)
        "House Martell" -> return category.update(R.drawable.martell, R.color.bgMartell, R.color.txtMartell)
        "House Targaryen" -> return category.update(R.drawable.targaryen, R.color.bgTargaryen, R.color.txtTargaryen)
        "House Stark" -> return category.update(R.drawable.stark, R.color.bgStark, R.color.txtStark)
        "House Tully" -> return category.update(R.drawable.tully, R.color.bgTully, R.color.txtTully)
        "House Greyjoy" -> return category.update(R.drawable.greyjoy, R.color.bgGreyjoy, R.color.txtGreyjoy)
        else -> return category
    }
}

/**
 * Extension helper method for updating a category instance
 */
private fun Category.update(image: Int, backgroundColor: Int, textColor: Int): Category{
    val category = this

    category.backgroundColor = backgroundColor
    category.image = image
    category.textColor = textColor

    return category
    //return Category(this.name, backgroundColor, image, textColor)
}