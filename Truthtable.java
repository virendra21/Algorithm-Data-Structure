/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

public class Truthtable {

    private static void printTruthTable(int n) {

        System.out.println("----Truth Table of " + n + " inputs function----");

        int rows = (int) Math.pow(2, n);
        if (n <= 3) {

            for (int i = 0; i < rows; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print((i / (int) Math.pow(2, j)) % 2 + " ");
                }
                System.out.println();

            }
        }

        System.out.println("For " + n + " input , table size is " + rows);

    }

    public static void main(String[] args) {
        printTruthTable(2);
        printTruthTable(3);
        printTruthTable(30);
       
    }
}
