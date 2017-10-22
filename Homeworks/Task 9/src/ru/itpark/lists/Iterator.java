package ru.itpark.lists;

public interface Iterator {
    int next(int[] array, Iterator iterator);
    boolean hasNext(int[] array);
}
