package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // Objektvariabler (attributter)
    private String name;
    private String email;
    private int customerId;
    private PowerAgreementType agreement;

    // Konstruktør
    public Customer(String name, String email, int customerId, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customerId = customerId;
        this.agreement = agreement;
    }

    // Getter- og setter-metoder
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public PowerAgreementType getAgreement() {
        return agreement;
    }

    public void setAgreement(PowerAgreementType agreement) {
        this.agreement = agreement;
    }

    // toString-metode
    @Override
    public String toString() {
        return "Customer Info:\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Customer ID: " + customerId + "\n" +
                "Agreement: " + agreement + "\n";
    }
}
