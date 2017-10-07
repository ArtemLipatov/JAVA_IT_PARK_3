package ru.itpark;


public class Menu {

    static int count = 0;

    static void showMenu() {
        System.out.println("ГЛАВНОЕ МЕНЮ:");
        System.out.println("1. Показать документы");
        System.out.println("2. Создать документ");
        System.out.println("3. Удалить документ");
        System.out.println("4. Работать с документом");
        System.out.println("5. Выход");
    }

    static void showDocuments(DocumentUtil Documents[]) {
        for (int i = 0; i < Documents.length; i++) {
            if (Documents[i] == null){
                System.out.println(i + " ____________");
            }
            else {
                System.out.println(i + " Документ " + Documents[i]);
            }
        }
    }

    static void addDocument(DocumentUtil Documents[], DocumentUtil document[]) {
        if (count == document.length) {
            System.err.println("Нет места");
        }
        else {
            document[count] = new DocumentUtil();
            Documents[count] = document[count];
            count++;
        }
    }

    static void deleteDocument(DocumentUtil Documents[], int docDelete) {
        for (int i = docDelete; i < Documents.length - 1; i++) {
            Documents[i] = Documents[i + 1];
        }
        Documents[Documents.length - 1] = null;
        count--;
    }
}