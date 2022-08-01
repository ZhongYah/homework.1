package com.train;

public class TesterDesign {
        int Total;
        int Return;

        public TesterDesign(int Total, int Return) {
            this.Total = Total;
            this.Return = Return;
        }

        public void print() {
            System.out.println("Total tickets: " + Total + "\n"
                    + "Round-trip: " + Return + "\n"
                    + "Total: $" + (int)((Total - Return)*1000 + Return*2000*0.9));

        }

}
