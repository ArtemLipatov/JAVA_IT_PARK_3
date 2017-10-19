package ru.itpark;

public interface Iterator {
    int next(int[] array, Iterator iterator);
    boolean hasNext(int[] array);
}
