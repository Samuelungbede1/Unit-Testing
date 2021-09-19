package com.example.test_work_week_five

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CalculatorTest {

    private lateinit var compute: Calculator

    @Before
    fun runFirst(){
        compute= Calculator()
    }


    @Test
    fun add_addTwoPositiveNumbers(){

        val a= 2
        val b= 5

        var result= compute.add (a,b)
        assertEquals(7,result)

    }



    @Test
    fun add_addTwoNegativeNumbers(){
        val a= -2
        val b= -5

        var result= compute.add (a,b)
        assertEquals(-7,result)

    }


    @Test
    fun divideTwoNumbers(){
        val a = 2.0
        val b = 5.0

        var result= compute.divideNumbers (a,b)
        assertEquals(0.4,result)

    }


    @Test
    fun concat_Words() {
        val a= "  co mma   nd "
        val b= " school"

        var result= compute.concatTwoWords (a,b)
        assertEquals("commandschool",result)

    }


}