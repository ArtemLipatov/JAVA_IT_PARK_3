package ru.itpark;

import java.io.IOException;
import java.util.Scanner;

public class MainMenuForDocuments {

    public static void menuDocuments(DocumentUtil document) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            document.showMenu();

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    document.showDocument();
                }
                break;
                case 2: {
                    if (document.count == document.lines.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    document.addLineToBegin(newLine);
                }
                break;
                case 3: {
                    if (document.count == document.lines.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    document.addLineToEnd(newLine);
                }
                break;
                case 4: {
                    System.out.println("Введите номер строки: ");
                    int delLine = scanner.nextInt();
                    if (delLine > document.lines.length) {
                        System.err.println("Нет такой строки");
                        break;
                    }
                    document.deleteLine(delLine, document.lines.length);
                }
                break;
                case 5: {
                    System.out.println("Введите номер строки: ");
                    int remove = scanner.nextInt();
                    if (remove > document.lines.length) {
                        System.err.println("Нет такой строки");
                        break;
                    }
                    System.out.println("Введите новую строку: ");
                    String newLine = scanner.next();
                    document.removeLine(remove, newLine);
                }
                break;
                case 6: {
                    System.out.println("Введите номер строки: ");
                    int clear = scanner.nextInt();
                    if (clear > document.lines.length) {
                        System.err.println("Нет такой строки");
                        break;
                    }
                    else {
                        document.clearLine(clear);
                    }
                }
                break;
                case 7:
                    return;
            }
        }

    }
}