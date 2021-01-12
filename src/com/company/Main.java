package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int name;//переменная
        int[] name1;// создание массива
        int[] name2 = new int[5];//создание массива и выдеение памяти
        int[] name3 = new int[] {23,14,56};
        float[] name4 = new float[]{23.6f,45.8f};
       // System.out.print(name4[0]);

        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        n = in.nextInt();
        a = new int [n];//веделяем память под массив в котором будет содержаться n элементов
        for (int i = 0; i<n; i++){
            System.out.print("Enter a[" + i + "] = ");
            a[i] = in.nextInt();
        }
    }
}
