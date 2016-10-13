/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

/**
 *
 * @author Viru
 */
public class Series2 {
    public static void main(String[] args) {
        double i,sum=0;
        for(i=1;i<=100;i=i*2){
          
          System.out.println("1/"+i);
        sum=sum+(1/i);
        }
        System.out.println(sum);
      
    }
    
}
