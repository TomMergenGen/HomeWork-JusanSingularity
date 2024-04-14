package kz.tomgeni;

public class HomeWorkApp1 {
    // Задание 1.
    public static void main(String[] args) {
        // Задание 6.
        printThreeWords();
        checkSumSign(-3,2);
        printColor(101);
        compareNumbers(-1,-1);
    }

    // Задание 2.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 3.
    public static void checkSumSign (int a, int b){
        int sum = a+b;
        if (sum>=0){
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    // Задание 4.
    public static void printColor (int value){
        if (value <= 0){
            System.out.println("Красный");
        }else if (value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Задание 5.
    public static void compareNumbers (int a, int b){
        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

}
