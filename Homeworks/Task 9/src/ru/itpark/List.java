package ru.itpark;

public interface List {
    void add(int a);
    void delete(int i);
    void searchByIndex(int i);
    void addByIndex(int i, int a);
    void returnIterator(Iterator iterator);
}
