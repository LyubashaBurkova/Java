package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //двумерные массивы имеют вид {{12.5f,34.5f},{12.5f,34.5f}};
        float[][] arr = new float[2][2];
        arr[0][0] = 12.5f;

        char[][] arr2 = new char[3][3];
        arr2[0][0] = 'C';

        System.out.print(arr[0][0]);
        char[][] arr3 = new char[3][3];
        for (int i = 0; i < arr.length; i++){
            arr3[i] = new char[3];
        }
        arr3[0][0] = 'C';
        System.out.print(arr3[0][0]);
    }
}
