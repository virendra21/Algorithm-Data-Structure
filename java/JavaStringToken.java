/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaprog;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStringToken {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        if (!sc.hasNext()){
            System.out.println(0);
        }else {
             String input=sc.nextLine();
            String[]a = input.trim().split("[ !,?._'@]+");
            ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
            System.out.println(listOfStrings.size());
      
          for(String str:listOfStrings){
            System.out.println(str);
          }    
        }
        
        
        
    }
}