package ru.itpark.lists;

import java.util.Scanner;

public class Menu {
    static void showMenu() {
        System.out.println("МЕНЮ:");
        System.out.println("1. ArrayList");
        System.out.println("2. LinkedList");
        System.out.println("3. Выход");
    }

    static void showMenuList() {
        System.out.println("МЕНЮ:");
        System.out.println("1. Добавить значение в начало");
        System.out.println("2. Добавить значение в конец");
        System.out.println("3. Добавить по индексу");
        System.out.println("4. Получить количество элементов");
        System.out.println("5. Развернуть список наоборот");
        System.out.println("6. Удалить по индексу");
        System.out.println("7. Удалить последний элемент");
        System.out.println("8. Вывести список");
        System.out.println("9. Вернуться");
    }

    public static void printList(List list) {
        Iterator iterator = list.iterator();

        if (iterator.hasNext()) {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.err.println("Список пуст");
        }
    }

    static void arrayMenu() {
        Scanner scanner = new Scanner(System.in);
        ArrayList arrayList = new ArrayList();

        while (true) {

            Menu.showMenuList();

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    System.out.println("Введите значение: ");
                    int addInt = scanner.nextInt();
                    arrayList.addToBegin(addInt);
                }
                break;
                case 2: {
                    System.out.println("Введите значение: ");
                    int addInt = scanner.nextInt();
                    arrayList.addToEnd(addInt);
                }
                break;
                case 3: {
                    System.out.println("Введите значение: ");
                    int addByIndexInt = scanner.nextInt();
                    System.out.println("Введите индекс: ");
                    int addByIndexIndex = scanner.nextInt();
                    arrayList.addByIndex(addByIndexInt, addByIndexIndex);
                }
                break;
                case 4: {
                    arrayList.howMany();
                }
                break;
                case 5: {
                    arrayList.reverse();
                }
                break;
                case 6: {
                    System.out.println("Введите индекс: ");
                    int delIndex = scanner.nextInt();
                    arrayList.deleteByIndex(delIndex);
                }
                break;
                case 7: {
                    arrayList.deleteLast();
                }
                break;
                case 8: {
                    printList(arrayList);
                }
                break;
                case 9:
                    Main.main(null);
            }
        }
    }

    static void linkedMenu() {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        while (true) {

            Menu.showMenuList();

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    System.out.println("Введите значение: ");
                    int addInt = scanner.nextInt();
                    linkedList.addToBegin(addInt);
                }
                break;
                case 2: {
                    System.out.println("Введите значение: ");
                    int addInt = scanner.nextInt();
                    linkedList.addToEnd(addInt);
                }
                break;
                case 3: {
                    System.out.println("Введите значение: ");
                    int addByIndexInt = scanner.nextInt();
                    System.out.println("Введите индекс: ");
                    int addByIndexIndex = scanner.nextInt();
                    linkedList.addByIndex(addByIndexInt, addByIndexIndex);
                }
                break;
                case 4: {
                    linkedList.howMany();
                }
                break;
                case 5: {
                    linkedList.reverse();
                }
                break;
                case 6: {
                    System.out.println("Введите индекс: ");
                    int delIndex = scanner.nextInt();
                    linkedList.deleteByIndex(delIndex);
                }
                break;
                case 7: {
                    linkedList.deleteLast();
                }
                break;
                case 8: {
                    printList(linkedList);
                }
                break;
                case 9:
                    Main.main(null);
            }
        }
    }
}