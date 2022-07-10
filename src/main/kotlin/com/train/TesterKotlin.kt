package com.train

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var totalTickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTrip  = scanner.nextInt()

    val kot = KotDesign(totalTickets, roundTrip );
    kot.print()
}

class KotDesign (var totalTickets: Int, var roundTrip: Int){
    fun print()
    {
        println("Total tickets: $totalTickets" + "\n"
                + "Round-trip: $roundTrip" + "\n"
                + "Total: $" + ((totalTickets - roundTrip)*1000 + roundTrip*2000*0.9).toInt())

    }
}