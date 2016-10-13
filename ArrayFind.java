/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

import java.util.Random;

public class ArrayFind {

   

   

    public static void findunique() {

        int j, k = 0;
        Random r = new Random();
        int[] a = {10, 55, 90, 4567, 1986};

        int max = Integer.MAX_VALUE;

        k = r.nextInt(max);

        for (int i = 0; i < a.length; i++) {

            if (k == a[i]) {

                k = r.nextInt(max);
                i = -1;

            }

        }
        System.out.println("You can use::" + k);
    }
    
     public static void main(String[] args) {

        
        System.out.println("-----Finding Unique Number Problem-----");
        findunique();
    }

}
