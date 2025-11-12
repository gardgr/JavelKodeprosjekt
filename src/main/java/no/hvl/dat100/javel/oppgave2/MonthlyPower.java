package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        // TODO
        for(int i = 0; i < usage.length; i++){
            int day = i+1;
            System.out.print("Day " + day + ":");
            for(int j = 0; j < usage[i].length; j++){
                System.out.print(usage[i][j] + " kWh ");
            }
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        // TODO
        for(int i = 0; i < prices.length; i++){
            int day = i+1;
            System.out.print("Day " + day + ":");
            for(int j = 0; j < prices[i].length; j++){
                System.out.print(prices[i][j] + " NOK ");

            }
            System.out.println();
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        // TODO
        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                sum += usage[i][j];
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int i =0;

        // TODO
        while(usage < threshold && i != powerusage[i].length){
            for(int j = 0; j < powerusage[i].length; j++){
                usage += powerusage[i][j];

            }
            i++;

        }
        if(usage > threshold){
            exceeded = true;
        }
        return exceeded;
    }



    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        // TODO
        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                price += usage[i][j] * prices[i][j];
            }
        }


        return price;
    }

    // f) power support for the month
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double support_hour = 0;

        // TODO
        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[j].length; j++){
                if(usage[i][j]*prices[i][j] > THRESHOLD){
                    support_hour = usage[i][j]*prices[i][j]-THRESHOLD;
                    support_hour *= PERCENTAGE;
                    support += support_hour;
                    support_hour = 0;

                }
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    private static final double NORGESPRIS_KWH = 0.5;
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO
        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                price += usage[i][j] * NORGESPRIS_KWH;
            }
        }

        return price;
    }
}
