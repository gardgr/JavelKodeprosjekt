package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a)
    public Customers(int size) {
        customers = new Customer[size];
    }

    // b)
    public int countNonNull() {
        int count = 0;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                count++;
            }
        }

        return count;
    }

    // c)
    public Customer getCustomer(int customer_id) {
        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomerId() == customer_id) {
                c = customers[i];
                break; // stopper når vi finner kunden
            }
        }

        return c;
    }

    // d)
    public boolean addCustomer(Customer c) {
        boolean inserted = false;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
                break;
            }
        }

        return inserted;
    }

    // e)
    public Customer removeCustomer(int customer_id) {
        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomerId() == customer_id) {
                c = customers[i];
                customers[i] = null; // fjerner referansen
                break;
            }
        }

        return c;
    }

    // f)
    public Customer[] getCustomers() {
        return customers;
    }
}
