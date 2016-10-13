/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobject;




import java.util.Random;


public class Bartender {

//    public static int getRandomInt(Random rand, int maximum) {
//        int return_x = rand.nextInt(maximum);
//        return return_x;
//
//    }

    public void ValueFor1000() {
        Random rand = new Random();
        boolean flag = true;
        int last_val = 1000;
        int lVal = 1, count = 1;
//        int select_value = getRandomInt(rand, 1000);
        int select_value = (int) (Math.random() * (1000 - 1 + 1)) + 1;
        System.out.println("Number to be guessed ::" + select_value);
        int temp = select_value;
        outerloop:
        if (select_value != 1) {
            if (select_value != 1000) {
                int midle_Var = (lVal + last_val) / 2;
                int tmpMiddleVar = midle_Var, tmpLVal = lVal, tmpLastVal = last_val;
                while (flag) {
//                    int midle_Var = (final_val + last_val) / 2;

                    if (midle_Var != select_value) {
                        if (select_value < midle_Var) {
                            System.out.println("Step: " + count + " Your random value between L: " + tmpLVal + " R: " + tmpLastVal + " M : " + tmpMiddleVar);
//                            last_val = midle_Var - 1;
//                            lVal = lVal + 1;
//                            midle_Var = ((3*midle_Var )/ 2);
                            if (select_value < midle_Var) {
                                last_val = midle_Var - 1;
                                tmpLastVal=last_val;
                            } else {
                                lVal = tmpMiddleVar + 1;
                            }
                            midle_Var = tmpLVal + ((tmpLastVal - tmpLVal) / 2);
                            tmpMiddleVar=midle_Var;

                        } else {
                            System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + midle_Var);
                            if (select_value < midle_Var) {
                                last_val = midle_Var - 1;
                            } else {
                                lVal = midle_Var + 1;
                                midle_Var = midle_Var + ((last_val - midle_Var) / 2);
                                tmpMiddleVar=midle_Var;
                                tmpLVal = lVal;
                            }
//                            last_val = last_val - 1;
                        }

                    } else {
                        System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + midle_Var);
                        System.out.println("Your Random value is : " + midle_Var);
                        break outerloop;

                    }

                    if (lVal == select_value) {
                        System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + midle_Var);
                        System.out.println("Your Random value is : " + lVal);
                        break outerloop;
                    }
                    if (last_val == select_value) {
                        System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + midle_Var);
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
    }
    public void valueFor1000000() {
        Random rand = new Random();
        boolean flag = true;
        int last_val = 1000000;
        int lVal = 1, count = 1;
//        int select_value = getRandomInt(rand, 1000);
        int select_value = (int) (Math.random() * (1000000 - 1 + 1)) + 1;
        System.out.println("Number to be guessed ::" + select_value);
        int temp = select_value;
        outerloop:
        if (select_value != 1) {
            if (select_value != 1000) {
                int midle_Var = (lVal + last_val) / 2;
                int tmpMiddleVar = midle_Var, tmpLVal = lVal, tmpLastVal = last_val;
                while (flag) {
//                    int midle_Var = (final_val + last_val) / 2;

                    if (midle_Var != select_value) {
                        if (select_value < midle_Var) {
                            System.out.println("Step: " + count + " Your random value between L: " + tmpLVal + " R: " + tmpLastVal + " M : " + tmpMiddleVar);
//                            last_val = midle_Var - 1;
//                            lVal = lVal + 1;
//                            midle_Var = ((3*midle_Var )/ 2);
                            if (select_value < midle_Var) {
                                last_val = midle_Var - 1;
                                tmpLastVal=last_val;
                            } else {
                                lVal = tmpMiddleVar + 1;
                            }
                            midle_Var = tmpLVal + ((tmpLastVal - tmpLVal) / 2);
                            tmpMiddleVar=midle_Var;

                        } else {
                            System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + midle_Var);
                            if (select_value < midle_Var) {
                                last_val = midle_Var - 1;
                            } else {
                                lVal = midle_Var + 1;
                                midle_Var = midle_Var + ((last_val - midle_Var) / 2);
                                tmpMiddleVar=midle_Var;
                                tmpLVal = lVal;
                            }
//                            last_val = last_val - 1;
                        }

                    } else {
                        System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + midle_Var);
                        System.out.println("Your Random value is : " + midle_Var);
                        break outerloop;

                    }

                    if (lVal == select_value) {
                        System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + midle_Var);
                        System.out.println("Your Random value is : " + lVal);
                        break outerloop;
                    }
                    if (last_val == select_value) {
                        System.out.println("Step: " + count + " Your random value between L: " + lVal + " R: " + last_val + " M : " + midle_Var);
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
    }


    public static void main(String[] args) {
        Bartender bartender = new Bartender();
        bartender.ValueFor1000();
        System.out.println();
        bartender.valueFor1000000();
    }

}

