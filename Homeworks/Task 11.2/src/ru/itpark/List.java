package ru.itpark;

public interface List {
    void addToBegin(Object element);
    void addToEnd(Object element);
    void howMany();
    void reverse();
    void addByIndex(Object element, int index);
    void deleteByIndex(int index);
    void deleteLast();
    Iterator iterator();
}