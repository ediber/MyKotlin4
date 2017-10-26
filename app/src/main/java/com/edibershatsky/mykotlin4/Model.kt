package com.edibershatsky.mykotlin4

/**
 * Created by Edi Bershatsky on 26/10/2017.
 */
class Model(var prev: Double, var operator: Operator) {

/*init {
    prev = 0.0
}*/

    enum class Operator {
        NONE, PLUS, MINUS
    }

    constructor() : this(0.0, Operator.NONE){
    }

    fun plus(num: Double) {
        calculate(num)
        operator = Operator.PLUS
    }

    fun minus(num: Double){
        calculate(num)
        operator = Operator.MINUS
    }



    fun toZero() {
        prev = 0.0
    }

    fun equal(num: Double) {
        calculate(num)
        operator = Operator.NONE
    }

    private fun calculate(num: Double) {
        when (operator) {
            Operator.PLUS -> prev = prev + num
            Operator.MINUS -> prev = prev - num
            else -> prev = num
        }
    }

}