package com.train

import java.util.Scanner

fun main(args: Array<String>) {
    var  totalTickets = 0
    while (totalTickets != -1) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
     totalTickets = scanner.nextInt()

        if (totalTickets == -1 ) {
            return
        }

        print("How many round-trip tickets: ")
        var roundTrip = scanner.nextInt()

        if(roundTrip > totalTickets || totalTickets == 0){
          println("Oops! Error!! Please enter correct number !!!" + "\n")
            continue
        }

        val kot = KotDesign(totalTickets, roundTrip);
        kot.print()

    }
}

class KotDesign (var totalTickets: Int, var roundTrip: Int){
    fun print()
    {
        println("Total tickets: $totalTickets" + "\n"
                + "Round-trip: $roundTrip" + "\n"
                + "Total: $ "+ ((totalTickets - roundTrip)*1000 + roundTrip*2000*0.9).toInt() + "\n")

    }
}