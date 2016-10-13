/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;

public class Sieve {

    private int max;
    private int[] p; //array that has prm number 
    private int pcount;
    private long steps;
    private boolean display = false;
    static IntUtil u = new IntUtil();

    Sieve(int n) {
        max = n;
        p = new int[n + 1];
        pcount = 0;
        steps = 0;
    }

    public void bruteForce() {
        if (max < 100) {
            display = true;
        }
        for (int i = 2; i <= max; i++) {

            int j = 2;
            boolean f = true;
            while (j < i) {
                if (i % j == 0) {
                    f = false;
                }
                j++;
            }
            if (f) {

                p[pcount] = i;
                if (display) {
                    System.out.print(" " + p[pcount]);
                }
                pcount++;
            }
        }
        System.out.println("");
    }

    public void uptoSquareRoot() {
        if (max < 100) {
            display = true;
        }
        // boolean f = true;
        for (int i = 2; i < max; i++) {
            int j = 2;
            boolean f = true;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    f = false;
                }
                j++;
            }
            if (f) {
                if (display) {
                    System.out.print(" " + i);
                }
                p[pcount] = i;
                pcount++;
            }

        }
        System.out.println();

    }

    public void uptoPrimeNumbers() {

        if (max < 10005) {
            display = true;
        }
        p[pcount] = 2;
        if (display) {
            System.out.print(" " + p[pcount]);
        }
        pcount++;

        int prm = 1;
        boolean isprm = false;
        while ((prm += 2) <= max) {
            isprm = true;
            for (int i = 0; i < pcount; i++) {
                if (prm % p[i] == 0) {
                    isprm = false;
                    break;
                }
            }
            if (isprm) {
                p[pcount] = prm;
                if (display) {
                    System.out.print(" " + p[pcount]);
                }
                pcount++;
            }
        }
        System.out.println("");

    }

    public void SieveOfEratosthenes() {
        boolean[] a = new boolean[max + 1];
        for (int i = 0; i <= max; ++i) {
            a[i] = true;
        }
        a[0] = false;
        a[1] = false;
        if (max < 1003) {
            display = true;
        }
        boolean[] Composite = new boolean[max + 1];
        for (int i = 2; i * i <= max; i++) {
            if (!Composite[i]) {
                for (int j = i; i * j <= max; j++) {
                    Composite[i * j] = true;
                }
            }
        }

        for (int i = 2; i <= max; i++) {
            if (!Composite[i]) {
                p[pcount] = i;
                if (display) {
                    System.out.print(" " + p[pcount]);
                }
                pcount++;
            }
        }
        System.out.println("");

    }

    //YOU CANNOT CHANGE BELOW
    public void pLn(String t) {
        System.out.println(t);
        if (display) {
            u.pLn(p, 0, pcount);
        }
        System.out.println("The numbers of prms from 2 to " + max + " = " + pcount);
        System.out.println("The number of steps is = " + steps);
        if (pcount >= 999) {
            System.out.println("The 1000 prm is = " + p[999]);
        }
        if (pcount >= 9999) {
            System.out.println("The 10000 prm is = " + p[10000 - 1]);
        }
    }

    //YOU CANNOT CHANGE BELOW
    public static void assertAnswers(Sieve a, Sieve b) {
        u.myassert(a.pcount == b.pcount);
        for (int i = 0; i < a.pcount; ++i) {
            u.myassert(a.p[i] == b.p[i]);
        }
    }

    //YOU CANNOT CHANGE BELOW
    private static void testAll(int n) {
        if (n < 2000) {
            Sieve b = new Sieve(n);
            b.bruteForce();
            Sieve s = new Sieve(n);
            s.uptoSquareRoot();
            assertAnswers(b, s);
            System.out.println("bruteforce and uptoSquareRoot methods produces same answers");
        }
        System.out.println("============uptoPrimeNumbers start " + n + " ---------------------");
        Sieve p = new Sieve(n);
        p.uptoPrimeNumbers();
        System.out.println("uptoPrimeNumbers done");
        System.out.println("============ SieveOfEratosthene start " + n + " ---------------------");
        Sieve e = new Sieve(n);
        e.SieveOfEratosthenes();
        System.out.println("SieveOfEratosthene done");
        assertAnswers(p, e);
        System.out.println("uptoPrimeNumbers and SieveOfEratosthene methods produces same answers");
        System.out.flush();
    }

    //YOU CANNOT CHANGE BELOW
    public static void main(String[] args) {
        System.out.println("Sieve.java");
        testAll(16);
        testAll(1000);
        testAll(50000);
        testAll(500000);
        System.out.println("DONE");
    }
}
