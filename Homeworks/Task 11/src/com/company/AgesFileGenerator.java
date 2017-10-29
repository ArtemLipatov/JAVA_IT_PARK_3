package com.company;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class AgesFileGenerator {

    public static void main(String[] args) {

        Random random = new Random();
        String data = Integer.toString(random.nextInt(100));
        int noOfLines = 9890;
        writeUsingBufferedWriter(data, noOfLines);
    }


    private static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("ages.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        Random random = new Random();
        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for (int i = 0; i < noOfLines || i < 100; i++) {
                 {
                    br.write(random.nextInt(100) + System.getProperty("line.separator"));
                }
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


