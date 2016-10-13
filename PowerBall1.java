/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;



import java.util.Scanner;

public class Powerball1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n[]  = new int[6];
        int w[] = {4, 8, 19, 27, 34, 10};
        int c = 0, pb = 0;
        int i, j;

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number");
        for (i = 0; i <=5; i++) 
        {

            n[i] = s.nextInt();
        }
        
        for (i = 0; i < 5; i++) 
        {
            for (j = 0; j < 5; j++) 
            {
                if (n[i] == w[j]) 
                {
                    c++;
                }
            }
        }
        if (n[5] == w[5]) 
        {
            pb++;

        }
        if (c == 5 && pb == 1) {
            System.out.println("you won the Jackpot");
        }
        if (c == 4 && pb == 0) {
            System.out.print("you won $1,000,000 ");
        }
        if (c == 4 && pb == 1) {
            System.out.println("you won $50,000");
        }
        if (c == 4 && pb == 0) {
            System.out.println("you won $100 ");
        }
        if (c == 3 && pb == 1) {
            System.out.println("you won $ 100 ");
        }
        if (c == 3 && pb == 0) {
            System.out.println("you won $ 7");
        }
        if (c == 2 && pb == 1) {
            System.out.println("you won $ 7 ");
        }
        if (c == 1 && pb == 1) {
            System.out.println("you won $ 4 ");
        }

        if (c == 0 && pb == 1) {
            System.out.println("you won $ 4");
        }
        if (c == 0 && pb == 0)
        {
            System.out.println("you did not win");
        }
    }

}
