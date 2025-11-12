package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Invoice {

    private Customer c;
    private String month;
    private double[][] usage;
    private double[][] prices;

    private double amount;

    // a)
    public Invoice(Customer c, String month, double[][] usage, double[][] prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = prices;
        this.amount = 0;
    }

    // b)
    public void computeAmount() {
        double sum = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                sum += usage[i][j] * prices[i][j];
            }
        }

        amount = sum;
    }

    public void printInvoice() {
        System.out.println("Faktura for: " + c.getName());
        System.out.println("Måned: " + month);
        System.out.println("Totalt beløp: " + amount + " kr");
    }
}
