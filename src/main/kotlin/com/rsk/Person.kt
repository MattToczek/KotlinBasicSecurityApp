package com.rsk

interface Signatory {
    fun sign()
}

// constructor can be set up in original class declaration as below:
// val = final(constant) and var = changeable(variable)
class Person (val name: String, var age: Int): Signatory {
    override fun sign(){
//      $ is used for template literals instead of string builder or concatenation
        println("$name is $age years old and can sign documents!")
    }
}

