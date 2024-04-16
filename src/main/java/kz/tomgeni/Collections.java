package kz.tomgeni;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        // Коллекции в Java

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(1, 20);

        System.out.println(list.get(1)); // Получает элемент
        list.remove(2); // Удаление элемента
        list.clear(); // Удаление всех элементов из списка

        for (int num:list
             ) {
            System.out.println(num);
        }

        // LinkedList

    }
}
