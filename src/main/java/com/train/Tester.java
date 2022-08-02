package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int Total = 0;
        while (Total != -1 ) {
            System.out.print("Please enter number of tickets: ");
            Scanner scanner = new Scanner(System.in);
            Total = scanner.nextInt();

            if (Total == -1) {
                return;
            }
//        System.out.print("Please enter number of tickets: ");
//        Scanner scanner = new Scanner(System.in);
//        int Total = scanner.nextInt();
            System.out.print("How many round-trip tickets: ");
            int Return = scanner.nextInt();

            if (Return > Total || Total == 0){
                System.out.println("Oops! Error!! Please enter correct number !!!" + "\n");
                continue;
            }
            TesterDesign test = new TesterDesign(Total, Return);
            test.print();

        }
    }
}






