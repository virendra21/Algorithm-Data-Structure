/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

import java.math.*;
import java.text.DecimalFormat;

class Series {

    private static void testLog() {
        double i;
        System.out.println("----------------------Test Log--------------------------");
        System.out.println("n\t\tbase10\t\tbase2\t\tbase e");
        for (i = 1; i <= 10000; i++) {
            if (i > 10) {
                i = i + 9;

            }
            if (i > 100) {
                i = i + 90;

            }
            if (i > 1000) {
                i = i + 900;

            }
            double b2 = Math.log(i) / Math.log(2);
            System.out.println((int) i + "\t\t" + new DecimalFormat("##.#####").format(Math.log10(i)) + "\t\t" + new DecimalFormat("##.#####").format(b2) + "\t\t" + new DecimalFormat("##.#####").format(Math.log(i)));

        }

    }

    /*
     * 1 + 1/2 + 1/4 + 1/8 + 1/16 +... + = 2
     */
    private static void seriesConvergesAbsolutely() {
        System.out.println("----------------------Series Converges Absolutely--------------------------");
        double i, sum = 0;
        for (i = 1; i <= 100; i = i * 2) {

            // System.out.println("1/" + i);
            sum = sum + (1 / i);
        }
        System.out.println("1 + 1/2 + 1/4 + 1/8 + 1/16 +... + =" + Math.round(sum));

    }

    /*
     * 1 + 1/2 + 1/3 + 1/4 + 1/5 + .. = 
     */
    private static void harmonicSeries() {
        System.out.println("----------------------Harmonic Series --------------------------");
        double i, sum = 0;
        for (i = 1; i <= 100; i++) {

            sum = sum + (1 / i);
        }
        System.out.println("1 + 1/2 + 1/3 + 1/4 + 1/5 + .. =" + sum);
        System.out.println("ln(100)+.57721566=" + (Math.log(100) + (0.57721566)));

    }

    private static void chess() {
        System.out.println("----------------------Chess--------------------------");
        int m = 64;
        double total = 0;
        for (int i = 0; i < m; i++) {
            double l = Math.pow(2, i);

            BigDecimal b = new BigDecimal(Math.pow(2, i));
            total += l;
            System.out.println("on square" + (1 + i) + "=" + b);

        }
        System.out.println("2^0 + 2^1 + 2^2+ 2^3+ ...+ 2^63 = (2^64 -1) = " + new BigDecimal(total));
    }

    private static void testbed() {
        testLog();
        seriesConvergesAbsolutely();
        harmonicSeries();
        chess();
    }

    public static void main(String[] args) {
        System.out.println("Series.java");
        testbed();
        System.out.println("Done");
    }
}
