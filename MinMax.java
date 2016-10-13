/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

class MinMax {

    private int[] a = {4, 3, 5, 1, 2, 6, 9, 2, 10, 11};
    ;
    private int n;
    private int min;
    private int max;
    private int numCompare;
    private int minr;
    private int maxr;
    private int numComparer;
    private int numRecursionr;
    private static final IntUtil u = new IntUtil();

    MinMax(int s) {
        numCompare = 0;
        numComparer = 0;
        numRecursionr = 0;
        System.out.println("--------------------------------");
        System.out.println("--------Simple----------");
        a = u.generateRandomNumber(s, true);
        minMaxSimple();
        System.out.println("Min= " + min + " Max= " + max);
        u.printStatistics(n, numCompare, 0, 0);
        System.out.println("---------Recursive--------------");
        System.out.println("n= " + n);

        minMaxRecursive(0, a.length - 1);
        System.out.println("Minr= " + minr + " Maxr= " + maxr);
        assert (min == minr);
        assert (max == maxr);
        u.printStatistics(n, numComparer, 0, numRecursionr);
        System.out.println("--------------------------------------------------------");
    }

    private static void testBench() {
        MinMax t = new MinMax(100);
        MinMax t1 = new MinMax(50);
    }

    private void minMaxSimple() {
        //  int[] a = {4, 3, 5, 1, 2, 6, 9, 2, 10, 11};
        max = a[0];
        min = a[0];
        int i = 0;
        for (; i < a.length / 2; i++) {
            numCompare++;
            int num1 = a[i * 2];
            int num2 = a[i * 2 + 1];
            if (a[i * 2] >= a[i * 2 + 1]) {

                if (num1 > max) {
                    max = num1;
                }
                if (num2 < min) {
                    min = num2;
                }
            } else {
                if (num2 > max) {
                    max = num2;
                }
                if (num1 < min) {
                    min = num1;
                }
            }
        }
        if (i * 2 < a.length) {
            int num = a[i * 2];
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

    }

   
private void minMaxRecursive(int l, int r) {
        numRecursionr++;
    //WRITE CODE
         int max1, min1, mid;
        if(l==r){
            //numCompare++;
            if(minr==0 && maxr==0){
                minr = a[l];
                maxr = a[r];
            }else {
                numComparer++;
                if(a[l] < minr){
                    minr = a[l];
                }
                if(a[l] > maxr){
                    maxr = a[l];
                }
            }
        }else{
            mid = ((r-l)/2) + l;
            minMaxRecursive(l,mid);
            max1 = maxr;
            min1 = minr;
            minMaxRecursive(mid+1,r);
             if (maxr < max1) {
                maxr = max1;
            }
            if (minr > min1) {
                minr = min1;

            }
        }
        
    }

    public static void main(String[] args) {
        System.out.println("MInMax.java");
        testBench();
    }

}
