/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaprog;

import java.util.Scanner;

public class formatting {

    public static void main(String[] args) {
        String s1 = null;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            s1 = sc.next();
            x = sc.nextInt();
               System.out.printf("%-15s%03d%n", s1, x);
            // System.out.println(s1 + "\t" +"\t"+  String.format("%03d", x));

        } 
        

        System.out.println("================================");

    }
}
