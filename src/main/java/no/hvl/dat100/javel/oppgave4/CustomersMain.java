package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // Lager objekt med plass til 3 kunder
        Customers customers = new Customers(3);

        Customer c1 = new Customer(1, "Ola Nordmann", PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer(2, "Kari Nordmann", PowerAgreementType.NORGESPRICE);

        customers.addCustomer(c1);
        customers.addCustomer(c2);

        System.out.println("Antall kunder: " + customers.countNonNull());

        Customer funnet = customers.getCustomer(2);
        if (funnet != null) {
            System.out.println("Fant kunde: " + funnet.getName());
        }

        customers.removeCustomer(1);

        System.out.println("Antall kunder etter sletting: " + customers.countNonNull());
    }
}
