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
public class FunnyPrint {

    private static void Print(int n, int max) {

        if (n >= 1) {
            System.out.print("*");
            Print(n - 1, max);
           
        } else if (max >= 1) {
            System.out.println();
            Print(max - 1, max - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of loop for n::");
        int n = in.nextInt();
        Print(n, n);
    }

}
