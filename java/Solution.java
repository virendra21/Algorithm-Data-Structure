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

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String ans = "";
        if (n < 1 || n > 100) {
            System.out.println("Enter number between 1 and 100");
        }

        if (n % 2 == 1) {
            ans = "Weird";
        } else if (n % 2 != 1 && n >= 6 && n <= 20) {
            ans = "Weird";
        } else {

            ans = "Not Weird";

        }
        System.out.println(ans);

    }
}
