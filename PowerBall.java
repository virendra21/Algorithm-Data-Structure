/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

import java.util.Scanner;

/**
 *
 * @author Viru
 */
class PowerBall {

    private int[] winningNumber;
    private int[] ticketNumber;
    private long cash;
    static private IntUtil u = new IntUtil();
    int matchBalCount;
    int powerBallMatchCount;

    public long cash() {
        for (int i = 0; i < ticketNumber.length; i++) {
            for (int j = 0; j < winningNumber.length; j++) {
                if (i == winningNumber.length - 1 && ticketNumber[i] == winningNumber[j]) {
                    powerBallMatchCount = 1;
                } else if (ticketNumber[i] == winningNumber[j]) {
                    matchBalCount++;
                }
            }
        }
        return check(powerBallMatchCount, matchBalCount);
    }

    public long check(int powerBalmatchcount, int matchballcount) {
        long cashWin = 0;
        if (matchBalCount == 0 && powerBallMatchCount == 1) {
            // System.out.println("4");
            cashWin = 4;
        } else if (matchBalCount == 1 && powerBallMatchCount > 0) {
            // System.out.println("4");
            cashWin = 4;
        } else if (matchBalCount == 2 && powerBallMatchCount > 0) {
            // System.out.println("7");
            cashWin = 7;
        } else if (matchBalCount == 3 && powerBallMatchCount == 0) {
            // System.out.println("7");
            cashWin = 7;
        } else if (matchBalCount == 3 && powerBallMatchCount > 0) {
            // System.out.println("100");
            cashWin = 100;
        } else if (matchBalCount == 4 && powerBallMatchCount == 0) {
            //System.out.println("100");
            cashWin = 100;
        } else if (matchBalCount == 4 && powerBallMatchCount > 0) {
            //System.out.println("50000");
            cashWin = 50000;
        } else if (matchBalCount == 5 && powerBallMatchCount == 0) {
            //System.out.println("1000000");
            cashWin = 100000;
        } else if (matchBalCount == 5 && powerBallMatchCount > 0) {
            System.out.println("grand prize");
            cashWin = 100000000;
        }
        return cashWin;
    }

    PowerBall(int[] w, int[] t) {
        winningNumber = w;
        ticketNumber = t;
        cash = 0;
    }

    private static void test1() {
        int[] w = {4, 8, 19, 27, 24, 10};
        {
            int[] n = {4, 8, 19, 27, 24, 10};
            PowerBall x = new PowerBall(w, n);
            x.cash();
        }
        {
            int[] n = {24, 27, 19, 8, 4, 10};
            PowerBall x = new PowerBall(w, n);
            x.cash();
        }
        {
            int[] n = {24, 27, 19, 8, 4, 5};
            PowerBall x = new PowerBall(w, n);
            x.cash();
        }
        {
            int[] n = {124, 127, 119, 18, 14, 10};
            PowerBall x = new PowerBall(w, n);
            x.cash();
        }
        {
            int[] n = {124, 127, 119, 18, 14, 5};
            PowerBall x = new PowerBall(w, n);
            x.cash();
        }
        {
            int[] n = {124, 127, 119, 4, 14};
            PowerBall x = new PowerBall(w, n);
            x.cash();
        }
        {
            int[] n = {124, 124, 19, 119, 18, 14};
            PowerBall x = new PowerBall(w, n);
            x.cash();
        }
    }

    private static void testRandom() {
        int[] w = {4, 8, 19, 27, 24, 10};
        int max = 10000;
        long c = 0;
        for (int i = 0; i < max; ++i) {
            int[] n = u.generateRandomNumber(6, true, 1, 99);
            PowerBall x = new PowerBall(w, n);
            c = c + x.cash();
        }
        System.out.println("Out of " + max + " times you win " + c + "$");
    }

    private static void testBench() {
        test1();
        testRandom();
    }

    public static void main(String[] args) {
        System.out.println("PowerBall.java");
        testBench();
        System.out.println("Done");
    }
}
