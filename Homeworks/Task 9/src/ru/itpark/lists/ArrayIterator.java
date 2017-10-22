package ru.itpark.lists;

import ru.itpark.lists.Iterator;

public class ArrayIterator implements Iterator {
    private int count = 0;

    @Override
    public int next(int[] array, Iterator iterator) {
        int result = 0;
        if (iterator.hasNext(array) == true) {
            result = array[count];
            count++;
        }
        return result;
    }

    @Override
    public boolean hasNext(int[] array) {
        if (count < array.length) {
            return true;
        } else {
            count = 0;
            return false;}
    }
}