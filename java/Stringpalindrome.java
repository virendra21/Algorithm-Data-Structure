/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaprog;
import java.io.*;
import java.util.*;

public class Stringpalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String B = new StringBuffer(A).reverse().toString();

        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
        
    

