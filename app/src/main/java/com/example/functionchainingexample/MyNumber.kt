package com.example.functionchainingexample

class MyNumber(private var number: Int = 0) {

    // all functions return a modified instance of MyNumber
    fun add(number: Int): MyNumber {
        this.number += number
        return this
    }

    fun subtract(number: Int): MyNumber {
        this.number -= number
        return this
    }

    fun multiply(number: Int): MyNumber {
        this.number *= number
        return this
    }

    fun divide(number: Int): MyNumber {
        this.number /= number
        return this
    }

    fun print(): MyNumber {
        println(number)
        return this
    }

    override fun toString(): String {
        return number.toString()
    }

    companion object {
        val MyNumber: MyNumber = MyNumber(0)

    }
}