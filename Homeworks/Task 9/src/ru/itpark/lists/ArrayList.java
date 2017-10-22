package ru.itpark.lists;

public class ArrayList implements List {
    private Node head;
    private int count = 0;
    int[] array = new int[6];


    @Override
    public void add(int a) {
        if (count<array.length){
            array[count] = a;
            count++;
        }else  {
            System.out.println("Список полон");
        }
    }

    @Override
    public void delete(int i) {
        if (count != 0){
            for (int j = i; j < array.length - 1; j++){
                array[j] = array[j + 1];
            }
            array[array.length - 1] = 0;
            count--;
        }else {
            System.out.println("Список пуст");
        }
    }
    @Override
    public void addByIndex(int i, int a) {
        if (i > count) {
            if (count < array.length) {
                array[i] = a;
                count++;
            } else {
                System.err.println("Список полон");
            }
        } else {
            array[i] = a;
        }
    }

    @Override
    public void searchByIndex(int i) {
        System.out.println("По индексу найдено: " + array[i]);
    }

    @Override
    public void returnIterator(Iterator iterator) {
        while (iterator.hasNext(array)) {
            System.out.println(iterator.next(array, iterator));;
        }
    }

    @Override
    public void addToBegin(int a) {
        for (int i = 0; i < array.length; i++) {
            if (count < array.length) {
                array[i] = a;
                count++;
            } else {
                System.out.println("Список полон");
            }
        }


    }

    @Override
    public void addToEnd(int a) {
        for (int i = 0; i < array.length; i++) {
            if (count < array.length) {
                array[array.length] = a;
                count++;
            } else {
                System.out.println("Список полон");
            }
        }


    }

    @Override
    public void getAmountElements() {
        System.out.println(array.length);
    }

    @Override
    public void reverse(int elements) {
        for (int i = 0; i < array.length; i++ ){
            array[i] = array.length - i;
            count++;
        }
    }

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}

