package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //public - модификатор доступа
        //void - функция ничего не возвращает
        //если она должна что-то возвращять, то передаем тип
        //main - имя функции
        //String[] args - параметры, их может не быть

        //int temp = func(2, 3);
        //System.out.print(temp);

        readArray();
    }

    public static int func (int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }

    public static int[] readArray (){
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        return arr; //при объявлении  функции мы уже указали, что возвращаем массив
    }
}
