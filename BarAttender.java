/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;

import java.util.Arrays;
import java.util.Random;

class BarAttender {

    private int min;
    private int max;
    static private IntUtil u = new IntUtil();

    BarAttender(int min, int max) {
        this.min = min;
        this.max = max;
    }

    private int guess(int g, boolean show) {

        int s_val = g;

        boolean flag = true;
        int last_val = max;
        int lVal = 1, count = 1;

        System.out.println("=======================================");

        outerloop:
        if (s_val != 1) {
            if (s_val != 1000) {
                int m_val = (lVal + last_val) / 2;
                int tmpMiddleVal = m_val, tmpLVal = lVal, tmpLastVal = last_val;
                while (flag) {

                    if (m_val != s_val) {
                        if (s_val < m_val) {
                            if (show == true) {
                                System.out.println("Step: " + count + " Your random value between L: " + tmpLVal + " R: " + tmpLastVal + " M : " + tmpMiddleVal);
                            }

                            if (s_val < m_val) {
                                last_val = m_val - 1;
                                tmpLastVal = last_val;
                            } else {
                                lVal = tmpMiddleVal + 1;
                            }
                            m_val = tmpLVal + ((tmpLastVal - tmpLVal) / 2);
                            tmpMiddleVal = m_val;

                        } else {
                            if (show == true) {
                                System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + m_val);
                            }
                            if (s_val < m_val) {
                                last_val = m_val - 1;
                            } else {
                                lVal = m_val + 1;
                                m_val = m_val + ((last_val - m_val) / 2);
                                tmpMiddleVal = m_val;
                                tmpLVal = lVal;
                            }
                        }

                    } else {
                        if (show == true) {
                            System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + m_val);
                        }
                        System.out.println("Your Random value is : " + m_val);
                        break outerloop;

                    }

                    if (lVal == s_val) {
                        if (show == true) {
                            System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + m_val);
                        }
                        System.out.println("Your Random value is : " + lVal);
                        break outerloop;
                    }
                    if (last_val == s_val) {
                        if (show == true) {
                            System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + m_val);
                        }
                        System.out.println("Your Random value is : " + last_val);
                        break outerloop;
                    }
                    count++;
                }
            } else {
                System.out.println("Your random value is 1000");
            }
        } else {
            System.out.println("Your random value is 1");
        }
        System.out.println("==================================");
        return count;

    }

    private static void test(int s, int b, int m, boolean useRandom, boolean show) {
        Random r = new Random();
        int min = 9999;
        int max = 0;

        BarAttender h = new BarAttender(s, b);
        for (int i = 0; i < m; ++i) {
            int v = i + s;

            if (useRandom) {
                v = RandomInt.getRandomInt(r, s, b);
            }
            int n = h.guess(v, show);

            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }

        }

        System.out.print("For numbers  between " + s + " to " + b + " ");
        if (useRandom) {
            System.out.print("(random numbers)");
        } else {
            System.out.print("(not random numbers)");
        }
        System.out.println(" the min guess is " + min + " max guess is " + max);
    }

    // Cannot change code below
    private static void testBench() {
        test(1, 10, 10, false, true);
        test(1, 1000000, 1000, false, false);
        test(1, 1000000, 1000, true, false);
    }

    // Cannot change code below
    public static void main(String[] args) {
        System.out.println("BarAttender.java");
        testBench();
        System.out.println("DONE");
    }
}
