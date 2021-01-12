package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        int j = 0;
        boolean isTrue = true;
        while (j < 10){
            j++;
            if (j % 2 == 0){
                continue;
            }
            System.out.print("j =" + j);
        }

        int k = 0;
        do {
            System.out.print("k = " + k);
        }while (k<0);
    }
}
