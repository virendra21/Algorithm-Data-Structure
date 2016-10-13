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
class NewClass {
    /*
     * ALL PRIVATE DATA BELOW
     */

    private int[] winningNumber;
    private int[] ticketNumber;
    private long cash;
    static private IntUtil u = new IntUtil();
    int matchBalCount;
    int powerBallMatchCount;
    
    

    

    NewClass(int[] w, int[] t) {
        winningNumber = w;
        ticketNumber = t;
        cash = 0;
        //check();
    }

    public int checkMatch(int [] userTicket)
        {

            int currIndex = 0; 
            int amountNumsMatching = 0; 
            System.out.println(currIndex);
            System.out.println("amt"+amountNumsMatching);
            System.out.println(userTicket.length);
            System.out.println(this.ticketNumber.length);

            if(userTicket.length == this.ticketNumber.length)
            {
                for (currIndex = 0; currIndex < this.ticketNumber.length; currIndex++)
                {
                      System.out.println(this.ticketNumber[currIndex]+"--"+userTicket[currIndex]);
                    if(this.ticketNumber[currIndex] == userTicket[currIndex])
                    {
                      
                        amountNumsMatching++; 
                      System.out.println(amountNumsMatching);
                    }

                }
            }

            return amountNumsMatching; 

        }
    
    
    private static void test1() {
        int[] w = {4, 8, 19, 27, 24, 10};
        {
            int[] n = {4, 8, 19, 27, 24, 10};
            NewClass x = new NewClass(w, n);
           // x.checkMatch(n);
        }
        {
            int[] n = {24, 27, 19, 8, 4, 10};
             NewClass x = new NewClass(w, n);
            x.checkMatch(w);
            
        }
        {
            int[] n = {24, 27, 19, 8, 4, 5};
            NewClass x = new NewClass(w, n);
            //x.checkMatch(n);
        }
        {
            int[] n = {124, 127, 119, 18, 14, 10};
             NewClass x = new NewClass(w, n);
            //x.checkMatch(w);
        }
        {
            int[] n = {124, 127, 119, 18, 14, 5};
            PowerBall x = new PowerBall(w, n);
            // x.cash();
        }
        {
            int[] n = {124, 127, 119, 18, 14};
            PowerBall x = new PowerBall(w, n);
            //   x.cash();
        }

        {
            int[] n = {124, 124, 19, 119, 18, 14};
            PowerBall x = new PowerBall(w, n);
            //  x.cash();
        }
    }

    private static void testRandom() {
        int[] w = {4, 8, 19, 27, 24, 10};
        int max = 10;
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
        // testRandom();
    }

    public static void main(String[] args) {
        System.out.println("PoweBall.java");
        testBench();
        System.out.println("Done");
    }

}
