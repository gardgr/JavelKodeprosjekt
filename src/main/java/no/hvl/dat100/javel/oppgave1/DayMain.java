package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */
        // a)
        System.out.println("a)");
        DailyPower.printPowerPrices(DayPowerData.powerprices_day);
        // b)
        System.out.println("b)");
        DailyPower.printPowerUsage(DayPowerData.powerusage_day);
        //c
        System.out.println("c)");
        System.out.println(DailyPower.computePowerUsage(DayPowerData.powerusage_day));
        //d
        System.out.println("d)");
        System.out.printf("%.2f", DailyPower.computeSpotPrice(DayPowerData.powerusage_day, DayPowerData.powerprices_day));
        System.out.println();
        //e
        System.out.println("e)");
        System.out.println(DailyPower.getSupport(DayPowerData.powerusage_day[0],DayPowerData.powerprices_day[0]));
        System.out.printf("%.2f",DailyPower.getSupport(DayPowerData.powerusage_day[8],DayPowerData.powerprices_day[8]));
        System.out.println();
        //f
        System.out.println("f)");
        System.out.println(DailyPower.computePowerSupport(DayPowerData.powerusage_day, DayPowerData.powerprices_day));
        //g
        System.out.println("g)");
        System.out.println(DailyPower.computeNorgesPrice(DayPowerData.powerusage_day));
        //h
        System.out.println("h)");
        System.out.println(DailyPower.findPeakUsage(DayPowerData.powerusage_day));
        //i
        System.out.println("i)");
        System.out.printf("%.2f", DailyPower.findAvgPower(DayPowerData.powerusage_day));
        System.out.println();



    }
}
