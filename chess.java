/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author Viru
 */
public class chess {
    public static void main(String[] args) {
        int m=64;
      double total=0;
        for(int i=0;i<m;i++){
          double l=Math.pow(2, i);
          
          BigDecimal b=new BigDecimal(Math.pow(2, i));
         total+=l;
            System.out.println("on square"+(1+i)+"="+b);
         // System.out.println("oon squre"+1+i+"bi::"+b);          
           // System.out.println("b::"+b);
        
        //sum=sum+(1/i);
        }
        System.out.println("2^0 + 2^1 + 2^2+ 2^3+ ...+ 2^63 = (2^64 -1) = "+new BigDecimal(total));
      
    }
    
}