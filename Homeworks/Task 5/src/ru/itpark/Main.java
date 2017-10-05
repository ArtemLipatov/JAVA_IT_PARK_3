package ru.itpark;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String document[] = new String[3];
        String documentList[] = new String[4];
        // Обеспечить функционал:
        // добавить строку в конец, в начало, в заданную
        // позицию, заменить строку, удалить строку, вывести весь документ
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.MainMenu();

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    Documents.showDocumentsList(documentList);
                }
                break;
                case 2: {
                    if (Documents.count == documentList.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newDoc = scanner.next();
                    Documents.addDocToBegin(documentList, newDoc);
                }
                break;
                case 3: {
                    if (Documents.count == documentList.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newDoc = scanner.next();
                    Documents.addDocToEnd(documentList, newDoc);
                }
                break;
                case 4: {
                    System.out.println("Введите строку: ");
                    int pos = scanner.nextInt();
                    Documents.delDoc(documentList, pos);
                }
                break;
                case 5: {
                    System.out.println("Введите номер строки для замены: ");
                    int pos = scanner.nextInt();
                    System.out.println("Введите номер строки для замены: ");
                    int pos1 = scanner.nextInt();
                    Documents.swapDoc(documentList, pos, pos1);
                }
                break;
                case 6: {
                    System.out.println("Введите строку: ");
                    int pos = scanner.nextInt();
                    Documents.clearDoc(documentList, pos);
                }
                break;
                case 7: {
                    System.out.println("Введите номер документа: ");
                    String DocPos = scanner.next();
                    Documents.WorkInDoc(document, DocPos);
                }
                case 8:
                    System.exit(0);
            }
        }
    }
}