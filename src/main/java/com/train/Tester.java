package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int Total = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int Return = scanner.nextInt();
        TesterDesign test = new TesterDesign(Total,Return);
        test.print();
    }
}

