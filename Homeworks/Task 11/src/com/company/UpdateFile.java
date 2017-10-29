package com.company;

import java.io.*;

public class UpdateFile {

    public static void main(String[] args)  {
        String filePath = "names.txt";
        String filePath2 = "ages.txt";
      //  String appendText = "Этой строкой мы будем обновлять существующий файл";
        // обновляем файл с помощью BufferedWriter
        appendUsingBufferedWriter(filePath, filePath2, 9890);
    }

    // обновляем файл с помощью BufferedWriter
    private static void appendUsingBufferedWriter(String filePath, String filePath2, int noOfLines) {
        File file = new File(filePath);
        FileWriter fr = null;
        BufferedWriter br = null;
        try {
            //для обновления файла нужно инициализировать FileWriter с помощью этого конструктора
            fr = new FileWriter(file, true);
            br = new BufferedWriter(fr);
            for (int i = 0; i < noOfLines || i < 100; i++) {
                br.newLine();
                //теперь мы можем использовать метод write или метод append
                br.write(filePath2);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}