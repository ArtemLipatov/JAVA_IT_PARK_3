package ru.itpark;

public class Menu {
    public static void showMenu() {
        System.out.println("МЕНЮ:");
        System.out.println("1. Показать документ");
        System.out.println("2. Вставить строку в начало");
        System.out.println("3. Вставить строку в конец");
        System.out.println("4. Удалить строку"); // спросить, какую строку удалить - сделать сдвиг
        System.out.println("5. Заменить строку");
        System.out.println("6. Очистить строку");
        System.out.println("7. Назад в меню документов");
    }

    public static void MainMenu() {
        System.out.println("1. Показать список документов");
        System.out.println("2. Добавить документ в начало списка");
        System.out.println("3. Добавить документ в конец списка");
        System.out.println("4. Удалить документ");
        System.out.println("5. Заменить документ");
        System.out.println("6. Очистить позицию в списке документации");
        System.out.println("7. Работать с документом");
        System.out.println("8. Выход");
    }
}
