package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second;
        boolean isTrue = false;
        System.out.print("Enter");
        first = num.nextInt();

        isTrue = first == 51;
        second = first == 15 ? 11 : 22;

        System.out.println("isTrue "+ isTrue);

        if (first == 10) {
            System.out.print("Num is 10");
            System.out.print("\n");
        }else{
            System.out.print("Num is not 10");
        }

        switch (first){
            case 51:
                System.out.print("51!!!!");
                break;
            case 47:
                System.out.print("47!!!!");
                break;
            case 30:
                System.out.print("30!!!!");
                break;
            case 31:
                System.out.print("31!!!!");
                break;
            default:
                System.out.print("Num is equal something");
        }
    }
}
