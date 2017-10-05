package ru.itpark;


import java.util.Scanner;

public class Documents {
    static int count = 0;

    public static void showDocumentsList(String documentLine[]) {
        for (int i = 0; i < documentLine.length; i++) {
            // тернарный условный оператор e ? a : b
            String DocToOut = documentLine[i] == null ? "_______" : documentLine[i];
            System.out.println(i + ": " + DocToOut);
        }
    }

    public static void addDocToBegin(String documentList[], String newDoc) {
        for (int i = count; i > 0; i--) {
            documentList[i] = documentList[i - 1];
        }
        documentList[0] = newDoc;
        count++;
    }

    public static void addDocToEnd(String documentList[], String newDoc) {
        documentList[count] = newDoc;
        count++;
    }

    public static void delDoc(String documentList[], int pos) {
        pos = pos - 1;
        for (int i = 0; i < documentList.length - pos - 1; i++) {
            documentList[pos + i] = documentList[pos + i + 1];
        }
        documentList[documentList.length - 1] = null;
    }

    public static void swapDoc(String documentList[], int pos, int pos1) {
        pos = pos - 1;
        pos1 = pos1 - 1;
        documentList[pos] = documentList[pos1];
        count++;
    }

    public static void clearDoc(String documentList[], int pos) {
        pos = pos - 1;
        documentList[pos] = null;
        count++;
    }

    public static void WorkInDoc(String document[], String DocPos) {
        document[count] = DocPos;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.showMenu();

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    DocumentUtil.showDocument(document);
                }
                break;
                case 2: {
                    if (DocumentUtil.count == document.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    DocumentUtil.addLineToBegin(document, newLine);
                }
                break;
                case 3: {
                    if (DocumentUtil.count == document.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    DocumentUtil.addLineToEnd(document, newLine);
                }
                break;
                case 4: {
                    System.out.println("Введите строку: ");
                    int pos = scanner.nextInt();
                    DocumentUtil.delLine(document, pos);
                }
                break;
                case 5: {
                    System.out.println("Введите строку 1 для замены: ");
                    int pos = scanner.nextInt();
                    System.out.println("Введите строку 2 для замены: ");
                    int pos1 = scanner.nextInt();
                    DocumentUtil.swapLine(document, pos, pos1);
                }
                break;
                case 6: {
                    System.out.println("Введите строку: ");
                    int pos = scanner.nextInt();
                    DocumentUtil.clearLine(document, pos);
                }
                break;

                case 7:
                    return;
            }
        }
    }
}

