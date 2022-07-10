package com.train;

public class TesterDesign {
        int OneWay;
        int Return;

        public TesterDesign(int OneWay, int Return) {
            this.OneWay = OneWay;
            this.Return = Return;
        }

        public void print() {
            System.out.println("Total tickets: " + OneWay);
            System.out.println("Round-trip: " + Return);
            System.out.println("Total: $" + (int)((OneWay - Return)*1000 + Return*2000*0.9));
        }
}
