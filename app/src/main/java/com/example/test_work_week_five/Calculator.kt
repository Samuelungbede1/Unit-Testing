package com.example.test_work_week_five

import kotlin.contracts.contract

class Calculator {

    fun add (num_one : Int,num_Two: Int): Int{
        return num_one+num_Two
    }



    fun twoNegativeNumber (num_one : Int,num_Two: Int): Int{

        return num_one+num_Two
    }


    fun divideNumbers (num_one : Double,num_Two: Double): Double{

        try { num_one/num_Two
        } catch (e : Exception){
            println("Exception is handled.")
        }

        return num_one/num_Two
    }


    fun concatTwoWords (word_one :String,word_Two: String): String {
       var  result  = ""
      var concat =  word_one+word_Two
//        for (i in concat) {
//            if (i != ' ') result += i
//        }
//        return result

       return   concat.filter { it != ' ' }
    }

}