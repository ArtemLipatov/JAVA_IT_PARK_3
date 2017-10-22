package ru.itpark.lists;

public class LinkedList implements List {
    private Node head;
    private int count;


    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    @Override
    public void add(int a) {

    }

    @Override
    public void delete(int i) {

    }

    @Override
    public void searchByIndex(int i) {

    }

    @Override
    public void addByIndex(int i, int a) {

    }

    @Override
    public void returnIterator(Iterator iterator) {

    }

    @Override
    public void addToBegin(int element) {
        Node newNode = new Node(element);

        if (head != null) {
            newNode.next = head;
        }

        head = newNode;
        count++;
    }

    @Override
    public void addToEnd(int element) {
        Node newNode = new Node(element);
        if (head != null) {
            newNode.next = head.next;
        } else {
            newNode.next = head;
        }
        count++;


    }

    @Override
    public void getAmountElements() {


    }

    @Override
    public void reverse(int element) {
        Node newNode = new Node(element)
        for (int i = 0; i<head.value; i++){
            element = head.value - i ;
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
