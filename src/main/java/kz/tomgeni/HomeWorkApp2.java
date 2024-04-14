package kz.tomgeni;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp2 {
    public static void main(String[] args) {

        // Задание 1.
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] newArray1 = converterZeroOne(array1);
        System.out.println(Arrays.toString(newArray1));
        //-------------------------------------------------

        // Задание 2.
        int[] array2 = new int[8];
        int a = 0;
        int someNum = 0;
        while (a < array2.length) {
            array2[a] = someNum;
            a++;
            someNum += 3;
        }
        System.out.println(Arrays.toString(array2));
        //-------------------------------------------------

        // Задание 3.
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] newArray3 = powSixArray(array3);
        System.out.println(Arrays.toString(newArray3));
        //-------------------------------------------------


        // Задание 4.
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][i] = 1;
                matrix[i][matrix.length - i - 1] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //-------------------------------------------------

        // Задание 5.
        Random r = new Random();
        int[] array4 = new int[10];
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array4.length; i++) {
            array4[i] = r.nextInt(15);
            System.out.print(array4[i] + " ");
        }

        maxAndMin(array4);
        //-------------------------------------------------

        //Задание 6.
        int[] array5 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(array5)); // Вернет true

        int[] array6 = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(array6)); // Вернет true
        //-------------------------------------------------

        //Задание 7.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = -1;
        shiftArray(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] converterZeroOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }

        return array;
    }

    public static int[] powSixArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        return array;
    }

    public static void maxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("\nМаксимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
    }

    public static boolean checkBalance(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }

        // Переменная для хранения суммы левой части массива
        int leftSum = 0;

        // Проходим по элементам массива и сравниваем сумму левой части и правой части
        for (int num : array) {
            if (leftSum == totalSum) {
                return true; // Если суммы равны, возвращаем true
            }
            totalSum -= num; // Вычитаем текущий элемент из общей суммы
            leftSum += num; // Прибавляем текущий элемент к сумме левой части
        }

        // Если равновесной точки не найдено, возвращаем false
        return false;
    }

    public static void shiftArray(int[] arr, int n) {
        int length = arr.length;
        // Если n равно 0 или кратно длине массива, то массив не изменится
        if (n == 0 || n % length == 0) {
            return;
        }
        // Если n положительное, смещаем элементы вправо
        if (n > 0) {
            n = n % length; // Приводим n к диапазону [0, length)
            reverse(arr, 0, length - 1); // Переворачиваем весь массив
            reverse(arr, 0, n - 1); // Переворачиваем первую часть массива (первые n элементов)
            reverse(arr, n, length - 1); // Переворачиваем вторую часть массива (оставшиеся элементы)
        } else { // Если n отрицательное, смещаем элементы влево
            n = Math.abs(n) % length; // Приводим n к диапазону [0, length)
            reverse(arr, 0, length - 1); // Переворачиваем весь массив
            reverse(arr, 0, length - n - 1); // Переворачиваем первую часть массива (первые length - n элементов)
            reverse(arr, length - n, length - 1); // Переворачиваем вторую часть массива (последние n элементов)
        }
    }

    // Метод для переворота части массива между индексами start и end включительно
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}