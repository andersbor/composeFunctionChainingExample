package com.example.functionchainingexample

class MyNumber(private val number: Int = 0) {

    // all functions return an instance of MyNumber
    fun add(value: Int): MyNumber {
        val newNumber: Int = this.number + value
        return MyNumber(newNumber)
    }

    fun subtract(value: Int): MyNumber {
        return MyNumber(this.number - value)
    }

    fun multiply(value: Int): MyNumber {
        return MyNumber(this.number * value)
    }

    fun divide(value: Int): MyNumber {
        return MyNumber(this.number / value)
    }

    override fun toString(): String {
        return number.toString()
    }

    companion object {
        val MyNumber: MyNumber = MyNumber(0)

    }
}