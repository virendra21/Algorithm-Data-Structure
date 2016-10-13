/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;


import java.util.ArrayList;
import java.util.Arrays;
public class Oneforloop {
    public static void main(String[] args) {
        ArrayList revArr = new ArrayList();
        String s = "Hi i am";
        System.out.println(s);
        String rev = s.replaceAll("\\s+","");
        System.out.println(rev);
        for (int i =0,j=rev.length()-1; i <= s.length()-1; i++) {
            if(s.charAt(i) == ' '){
            revArr.add(' ');
        }else if(j>=0){
            revArr.add(rev.charAt(j));
            j--;
        }
        }
        rev = Arrays.toString(revArr.toArray());
        System.out.println(rev);
       String tr = rev.substring(1,rev.length()-1).replace(", ","");
        System.out.println(tr);
    }
}