package com.train

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var oneway = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTrip  = scanner.nextInt()

    val test = TesterDesign(oneway, roundTrip );
    test.print()
}

class TesterDesign (var oneway: Int, var roundTrip: Int){
    fun print()
    {
        println("Total tickets: $oneway");
        println("Round-trip: $roundTrip");
        println("Total: $" + ((oneway - roundTrip)*1000 + roundTrip*2000*0.9).toInt());
    }
}