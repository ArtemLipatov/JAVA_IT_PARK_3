package com.company;

public interface StringList {
    void addToBegin(String element);
    void addToEnd(String element);
    void howMany();
    void reverse();
    void addByIndex(String element, int index);
    void deleteByIndex(int index);
    void deleteLast();

    StringIterator iterator();
}