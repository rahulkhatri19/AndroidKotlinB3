package com.example.unituitesting

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalulatorTest {
    @Test
    fun testAdd(){
        val calculator = Calculator()
        val result = calculator.add(3,5)
        assertEquals(8, result)
    }

    @Test
    fun testSubtract(){
        val calculator = Calculator()
        val result = calculator.subtract(4,2)
        assertEquals(2, result)
    }
}

class Calculator{
    fun add(a:Int, b:Int):Int {
        return a+a
    }
    fun subtract(a:Int, b:Int):Int {
        return a-b
    }
}