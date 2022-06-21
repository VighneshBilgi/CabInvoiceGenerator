package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {

    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        double totalFare= distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if(totalFare< MINIMUM_FARE){
            return MINIMUM_FARE;
        }
        return totalFare;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Cab Invoice Generator:");

        CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
        double totalFare = cabInvoiceGenerator.calculateFare(30,90);
        System.out.println(totalFare);

    }
}
