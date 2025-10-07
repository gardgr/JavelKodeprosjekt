package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */
        //a
        MonthlyPower.print_PowerUsage(MonthPowerData.powerusage_month);
        System.out.println();
        //b
        MonthlyPower.print_PowerPrices(MonthPowerData.powerprices_month);
        System.out.println();
        //c
        System.out.println(MonthlyPower.computePowerUsage(MonthPowerData.powerusage_month));
        //d
        System.out.println(MonthlyPower.exceedThreshold(MonthPowerData.powerusage_month, 500));
        System.out.println(MonthlyPower.exceedThreshold(MonthPowerData.powerusage_month, 1000));
        //e
        System.out.println(MonthlyPower.computeSpotPrice(MonthPowerData.powerusage_month, MonthPowerData.powerprices_month));
        //f
        System.out.println(MonthlyPower.computePowerSupport(MonthPowerData.powerusage_month, MonthPowerData.powerprices_month));
        //g
        System.out.println(MonthlyPower.computeNorgesPrice(MonthPowerData.powerusage_month));


    }
}