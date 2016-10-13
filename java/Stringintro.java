/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaprog;

import java.io.*;
import java.util.*;


public class Stringintro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println((int)A.length()+(int)B.length());
        System.out.println(0<A.compareTo(B)?"Yes":"No");
         A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
         B = (B.substring(0,1)).toUpperCase() + B.substring(1);
         System.out.println(A + " " + B);
       
        
        
    }
}



    
    
    
    
