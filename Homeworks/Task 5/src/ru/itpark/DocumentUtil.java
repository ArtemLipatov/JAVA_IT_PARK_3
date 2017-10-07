package ru.itpark;

public class DocumentUtil {
    int count = 0;
    String lines[] = new String[5];

    void showMenu() {
        System.out.println("МЕНЮ:");
        System.out.println("1. Показать документ");
        System.out.println("2. Вставить строку в начало");
        System.out.println("3. Вставить строку в конец");
        System.out.println("4. Удалить строку");
        System.out.println("5. Заменить строку");
        System.out.println("6. Очистить строку");
        System.out.println("7. Вернутся в главное меню");
    }

    void showDocument() {
        for (int i = 0; i < lines.length; i++) {
            // тернарный условный оператор e ? a : b
            String lineToOut = lines[i] == null ? "_______" : lines[i];
            System.out.println(i + ": " + lineToOut);
        }
    }

    void addLineToBegin(String newLine) {
        for (int i = count; i > 0; i--) {
            lines[i] = lines[i - 1];
        }
        lines[0] = newLine;
        count++;
    }

    void addLineToEnd(String newLine) {
        lines[count] = newLine;
        count++;
    }

    void deleteLine(int delete, int length) {
        for (int i = delete; i < length - 1; i++) {
            lines[i] = lines[i + 1];
        }
        lines[lines.length - 1] = null;
        count--;
    }

    void removeLine(int remove, String newLine){lines[remove] = newLine;
    }

    void clearLine(int clear){lines[clear] = null;
    }

}