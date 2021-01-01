package com.nt.first;

public class Prime1 {
    public static void main (String[] args) {
        int no = 7;
        int temp = 0;
        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }

        }
        if (temp == 0) {
            System.out.println(no+" \nPrime");

        } else {
            System.out.println("not Prime");
        }


    }
}
