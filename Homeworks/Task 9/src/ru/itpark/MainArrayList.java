package ru.itpark;

import ru.itpark.lists.ArrayIterator;
import ru.itpark.lists.ArrayList;
import ru.itpark.lists.Iterator;
import ru.itpark.lists.List;


import java.util.Scanner;

public class MainArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        Iterator iterator = new ArrayIterator();
        while (true) {
            System.out.println("МЕНЮ:");
            System.out.println("1. Добавить следующее значение");
            System.out.println("2. Добавить");
            System.out.println("3. Удалить");
            System.out.println("4. Поиск");
            System.out.println("5. Вывести весь список");
            System.out.println("6. Выход");
            int value = scanner.nextInt();
            switch (value) {
                case 1: {
                    System.out.println("Введите значение: ");
                    int addInt = scanner.nextInt();
                    list.add(addInt);
                }
                break;
                case 2: {
                    {
                        System.out.println("Введите значение: ");
                        int addByIndexInt = scanner.nextInt();
                        System.out.println("Введите индекс: ");
                        int addByIndexIndex = scanner.nextInt();
                        list.addByIndex(addByIndexIndex, addByIndexInt);
                    }
                    break;
                }
                case 3:{
                    System.out.println("Введите индекс: ");
                    int delete = scanner.nextInt();
                    list.delete(delete);
                }
                case 4:{
                    System.out.println("Введите индекс: ");
                    int search = scanner.nextInt();
                    list.searchByIndex(search);
                }
                case 5: {
                    list.returnIterator(iterator);
                    break;
                }
                case 6:{
                    System.exit(0);
                }

            }
        }
    }
}
