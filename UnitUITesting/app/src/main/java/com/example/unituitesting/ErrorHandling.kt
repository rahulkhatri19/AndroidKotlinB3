package com.example.unituitesting

class ErrorHandling {
}

fun main(){
    try
    {
        val result = 10/0
        println("result = $result")
    } catch (e:ArithmeticException){
        val result = 10/1
        println("Exception : ${e.printStackTrace()},$result")
    }
}