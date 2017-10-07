package ru.itpark;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество документов: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        DocumentUtil Documents[] = new DocumentUtil[size];
        DocumentUtil document[] = new DocumentUtil[size];

        while (true) {

            Menu.showMenu();

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    Menu.showDocuments(Documents);
                }
                break;
                case 2: {
                    Menu.addDocument(Documents, document);
                }
                break;
                case 3: {
                    System.out.println("Выберите номер документа: ");
                    int docDelete = scanner.nextInt();
                    Menu.deleteDocument(Documents, docDelete);
                }
                break;
                case 4: {
                    System.out.println("Введите номер документа: ");
                    int number = scanner.nextInt();
                    MainMenuForDocuments.menuDocuments(Documents[number]);
                }
                break;
                case 5:
                    System.exit(0);
            }
        }

    }
}