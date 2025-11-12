package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer c1 = new Customer(1, "Ola Nordmann", PowerAgreementType.SPOTPRICE);

        double[][] usage = {
                {1.0, 0.5, 0.8}, // dag 1
                {0.9, 1.1, 0.7}  // dag 2
        };

        double[][] prices = {
                {2.0, 2.5, 2.2}, // dag 1
                {2.1, 2.0, 2.3}  // dag 2
        };

        Invoice invoice = new Invoice(c1, "November", usage, prices);

        invoice.computeAmount();

        invoice.printInvoice();
    }
}

