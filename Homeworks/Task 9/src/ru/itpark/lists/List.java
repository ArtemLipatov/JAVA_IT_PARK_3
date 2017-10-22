package ru.itpark.lists;

import ru.itpark.lists.Iterator;

public interface List {
    void add(int a);
    void delete(int i);
    void searchByIndex(int i);
    void addByIndex(int i, int a);
    void returnIterator(Iterator iterator);
    void addToBegin(int a);
    void addToEnd(int a);
    void getAmountElements();
    void reverse(int element);

}
