package com.testmaximum.generics;

public class MaximumValue {
    /**
     * UC 1: method for finding maximum integer value
     */
    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if(num2.compareTo(max) > 0) {
            max = num2;
        }
        if(num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    /**
     * UC 2:  method for finding maximum float value
     */
    public static Float findMax(Float num1, Float num2, Float num3) {
        float max = num1;
        if(num2.compareTo(max) > 0) {
            max = num2;
        }
        if(num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    /**
     * UC 3:  method for finding maximum String value
     */
    public static String findMax(String str1, String str2, String str3) {
        String max = str1;
        if(str2.compareTo(max) > 0) {
            max = str2;
        }
        if(str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Value of Integer given is :" + findMax(6,3,9));
        System.out.println("Maximum value of Float numbers given is :" + findMax(1.0f,5.0f,3.0f));
        System.out.println("Maximum value of String given is :" + findMax("Boy","Girl","Animal"));
    }
}
