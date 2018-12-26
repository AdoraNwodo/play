package com.adoranwodo.play.data


class Question{

    var id: Int = 0

    var question: String? = null

    var optionA: String? = null
    var optionB: String? = null
    var optionC: String? = null
    var optionD: String? = null
    var answer: String? = null

    var points: Int = 0
    var difficulty: String? = null
    var category: Int = 0


    constructor(){}

    constructor( id: Int,
                 question: String,
                 optionA: String,
                 optionB: String,
                 optionC: String,
                 optionD: String,
                 points: Int,
                 difficulty: String,
                 category: Int,
                 answer: String){

        this.id = id
        this.question = question
        this.optionA = optionA
        this.optionB = optionB
        this.optionC = optionC
        this.optionD =optionD
        this.points = points
        this.difficulty = difficulty
        this.category = category
        this.answer = answer

    }

}