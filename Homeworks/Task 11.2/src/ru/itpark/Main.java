package ru.itpark;

import java.io.IOException;

public class Main {

    public static void printList(List list) {
        Iterator iterator = list.iterator();

        if (iterator.hasNext()) {
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {

        DataReader reader = new DataReader("names and ages.txt");
        DataReader numbersReader = new DataReader("names and ages.txt");
        LinkedList age[] = new LinkedList[101];
        for (int i = 0; i < age.length; i++) {
            age[i] = new LinkedList();
        }
        String word = reader.readString();
        int number = numbersReader.readInteger();
        age[number].addToBegin(word);
        while (number != 0) {
            word = reader.readString();
            number = numbersReader.readInteger();
            age[number].addToBegin(word);
        }
        for (int i = 0; i < age.length; i++) {
            age[i].addToBegin(String.valueOf(i));

        }
        for (int i = 0; i < age.length; i++) {
            printList(age[i]);
            System.out.print("\n");
        }

    }
}