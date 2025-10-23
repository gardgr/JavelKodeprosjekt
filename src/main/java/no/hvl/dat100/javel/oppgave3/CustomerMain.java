package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

        public static void main(String[] args) {

            System.out.println("==============");
            System.out.println("OPPGAVE 3");
            System.out.println("==============");
            System.out.println();

            PowerAgreementType[] avtale = PowerAgreementType.values();

            Customer customer1 = new Customer("Ola Nordmann", "ola.nordmann@example.com", 1001, avtale);

            System.out.println("Kunde opprettet med hentet avtale:");
            System.out.println(customer1);
        }
    }

