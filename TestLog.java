/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

import java.text.DecimalFormat;


/**
 *
 * @author Viru
 */
public class TestLog {
    
    public static void main(String[] args) {
         double i;
         
      
     System.out.println("n\tbase10\tbase2\tbase e");
    for(i=1;i<=10000;i++)
    {
        if(i>10)
        {
        i=i+9;
        
        }
        if(i>100)
        {
            i=i+90;
        
        
        }
        if(i>1000)
        {
        i=i+900;
        
        }
       double b2=Math.log(i)/Math.log(2);
        System.out.println((int)i+"\t"+new DecimalFormat("##.#####").format(Math.log10(i))+"\t"+new DecimalFormat("##.#####").format(b2)+"\t"+new DecimalFormat("##.#####").format(Math.log(i)));
    
       }
    
    
    }
    }
    

