package ru.itpark.lists;

import ru.itpark.lists.Iterator;

public interface List {
    void addToBegin(int element);
    void addToEnd(int element);
    void howMany();
    void reverse();
    void addByIndex(int element, int index);
    void deleteByIndex(int index);
    void deleteLast();
    Iterator iterator();
}