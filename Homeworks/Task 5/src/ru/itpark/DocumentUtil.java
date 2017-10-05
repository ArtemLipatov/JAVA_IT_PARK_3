package ru.itpark;

public class DocumentUtil {
    static int count = 0;

    public static void showDocument(String document[]) {
        for (int i = 0; i < document.length; i++) {
            // тернарный условный оператор e ? a : b
            String lineToOut = document[i] == null ? "_______" : document[i];
            System.out.println(i + ": " + lineToOut);
        }
    }

    public static void addLineToBegin(String document[], String newLine) {
        for (int i = count; i > 0; i--) {
            document[i] = document[i - 1];
        }
        document[0] = newLine;
        count++;
    }

    public static void addLineToEnd(String document[], String newLine) {
        document[count] = newLine;
        count++;
    }

    public static void delLine(String document[], int pos) {
        pos = pos - 1;
        for (int i = 0; i < document.length - pos - 1; i++) {
            document[pos + i] = document[pos + i + 1];
        }
        document[document.length - 1] = null;
    }

    public static void swapLine(String document[], int pos, int pos1) {
        document[pos] = document[pos1];
        count++;
    }

    public static void clearLine(String document[], int pos) {
        pos = pos - 1;
        document[pos] = null;
        count++;
    }
}