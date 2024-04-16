package kz.tomgeni;

import java.util.Random;
import java.util.Scanner;

public class Arryays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int [] arr1 = new int [10];
        for (int num: arr1
             ) {
            num = r.nextInt(10);
            System.out.print(num+" ");
        }

        System.out.println("");

        int [] arr2 = new int [3];
        for (int i = 0; i<arr2.length; i++){
            System.out.println("Введите элемент "+(i+1));
            arr2[i] = sc.nextInt();
        }

        for (int num: arr2
        ) {
            System.out.print(num+" ");
        }

    }
}
