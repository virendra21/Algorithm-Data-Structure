/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaprog;
import java.io.*;
import java.util.*;

public class Stringanargam {

   static boolean isAnagram(String A, String B) {
      if(A.length() != B.length()){
           return false;
       }else{
		   // sort the strings and see if they are equal to be considered an Anagram
           char a[] = A.toLowerCase().toCharArray();
           char b[] = B.toLowerCase().toCharArray();
           Arrays.sort(a);
           Arrays.sort(b);
          
           String sortedA = String.valueOf(a);
           String sortedB = String.valueOf(b);
           if(sortedA.equals(sortedB)){
               return true;
           }
           
        
       }
       return false;
   
   }
   
   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
