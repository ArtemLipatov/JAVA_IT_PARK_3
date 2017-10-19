package ru.itpark;

public class ArrayList implements List {
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
}

