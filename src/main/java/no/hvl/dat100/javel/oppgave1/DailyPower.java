package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for (double s : prices){
            System.out.printf("%.2f NOK ", s);
        }
        System.out.println();


    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (double s : usage) {
            System.out.print(s + " kWh ");
        }
        System.out.println();
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        // TODO
        for(double s : usage){
            sum += s;
        }


        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        // TODO
        for(int i = 0; i < usage.length; i++){
            price += usage[i] * prices[i];
        }

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    public static double getSupport(double usage, double price) {

        double support = 0;
        double cost = usage * price;

        // TODO
        if (cost > THRESHOLD){

            cost = cost - THRESHOLD;
            support = cost * PERCENTAGE;

        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        double support_hour = 0;
        double cost = 0;
        // TODO
        for(int s = 0; s < usage.length; s++){
            if (usage[s]*prices[s] > THRESHOLD){

                support_hour = usage[s]*prices[s]-THRESHOLD;
                support_hour *= PERCENTAGE;

                support += support_hour;
                support_hour = 0;

            }
            else{

            }
            support_hour = 0;
        }


        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        // TODO
        for(double s : usage){
            price += s*NORGESPRIS_KWH;
        }

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        // TODO
        for(int s = 0; s < usage.length; s++){
            if(usage[s] > temp_max){
                temp_max = usage[s];

            }
        }

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;
        double sum = 0;

        // TODO
        for(int i = 0; i < usage.length; i++){
            sum += usage[i];
        }
        average = sum/usage.length;


        return average;
    }
}