/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;


public class Same {
    
   public static void main(String []args) {
      int[] list1 = {1, 2, 3, 4, 5,10};
      int[] list2 = {3, 2, 5, 2,2,10};
       
      numSame(list1, list2);
   }
    
   public static void numSame (int[] list1, int[] list2) {
      int same = 0;
      // System.out.println(list1.length-1);
      for (int i = 0; i <= list1.length-1; i++) {
         for(int j = 0; j <= list2.length-1; j++) {
            System.out.println(list1[i]+"--"+list2[j]);
            if (list1[i] == list2[j]) {
               same++;
            }
         }
      }
      System.out.println(same);
   }
    
}