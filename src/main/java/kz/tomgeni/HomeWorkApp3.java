package kz.tomgeni;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp3 {
    public static void main(String[] args) {

        /*
        // Задание 1.
        Random r = new Random();
        int someNum = r.nextInt(9);
        System.out.println("Система загадала случайно число: " + someNum);

        Scanner sc = new Scanner(System.in);
        int currentNum;
        int answer;

        do {

            System.out.print("Введите загаданное число: ");
            currentNum = sc.nextInt();

            if (currentNum > someNum) {
                System.out.println("Введенное вами число больше загаданного, повторите попытку.");
            } else if (currentNum < someNum) {
                System.out.println("Введенное вами число меньше загаданного, повторите попытку.");
            } else {
                System.out.println("Вы угадали!");
                break; // Выход из цикла при угадывании числа
            }

            System.out.println("Хотите ли повторить? Наберите (0: Нет) или (1: Да) ");
            answer = sc.nextInt();

            if (answer == 0) {
                System.out.println("Вы не хотите повторять! Благодарим за игру.");
                break; // Выход из цикла при ответе "Нет"
            }

        } while(true);

         */

        // Задание 2.
        String[] words = {"apple", "orange", "lemon", "banana", "grape", "peach"};
        String chosenWord = words[(int) (Math.random() * words.length)];
        int wordLength = chosenWord.length();
        char[] guessedWord = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            guessedWord[i] = '#';
        }

        Scanner scanner = new Scanner(System.in);
        boolean wordGuessed = false;

        while (!wordGuessed) {
            System.out.print("Загаданное слово:  ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.equals(chosenWord)) {
                System.out.println("Поздравляем! Ты угадал слово");
                wordGuessed = true;
            } else {
                for (int i = 0; i < wordLength; i++) {
                    if (i < guess.length() && guess.charAt(i) == chosenWord.charAt(i)) {
                        guessedWord[i] = chosenWord.charAt(i);
                    }
                }
                System.out.println("Неверное предположение. Вот раскрытая часть слова:");
                for (char c : guessedWord) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }

    }
}
