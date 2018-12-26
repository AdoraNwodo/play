package com.adoranwodo.play.data

/**
 * Represents a Single Game Category.
 * A Category has these four properties: Name, Image, Background Color & Text Color
 */
data class Category(var name: String,
                    var image: Int = 0,
                    var backgroundColor: Int = 0,
                    var textColor: Int = 0)