package ru.itpark;

public class LinkedList implements List {

    private Node head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public void addToBegin(Object element) {
        // создали узел для элемента
        Node newNode = new Node(element);

        if (head != null) {
            newNode.next = head;
        }

        head = newNode;
        count++;
    }

    @Override
    public void addToEnd(Object element) {
        Node newNode = new Node(element);
        Node lastNode = null;
        LinkedListIterator iterator = new LinkedListIterator();
        while (iterator.hasNext()) {
            lastNode = iterator.currentNode;
            iterator.next();
        }
        lastNode.next = newNode;
        count++;
    }

    @Override
    public void howMany() {
        int a = 0;
        LinkedListIterator iterator = new LinkedListIterator();
        while (iterator.hasNext()) {
            iterator.next();
            a++;
        }
        System.out.print(a);
    }

    @Override
    public void reverse() {
        Node temp = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = temp;
            temp = current;
            current = next;
        }
        head = temp;
    }

    @Override
    public void addByIndex(Object element, int index) {
        Node newNode = new Node(element);
        Node current = head;
        Node next = current.next;
        if (index != 0) {
            for (int i = 0; i < index - 1; i++) {
                if (current.next != null) {
                    current = next;
                    next = current.next;
                }
            }
            current.next = newNode;
            newNode.next = next;
        } else {
            newNode.value = head.value;
            head.next = newNode;
            head.value = element;
            newNode.next = next;
        }
        count++;
    }

    @Override
    public void deleteByIndex(int index) {
        Node current = head;
        Node next = current.next;
        for (int i = 0; i < index; i++) {
            if (current.next != null) {
                current = next;
                next = current.next;
            }
        }
        current.value = next.value;
        current.next = next.next;
        count--;
    }

    @Override
    public void deleteLast() {
        if (head != null) {
            if (head.next != null) {
                Node current = head;
                Node next = current.next;
                while (next.next != null) {
                    current = next;
                    next = current.next;
                }
                current.next = null;
            } else {
                head = null;
            }
            count--;
        } else {
            System.out.println("Список пуст");
        }
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator {

        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public Object next() {
            Object element =  currentNode.value;
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }

    private static class Node {
        private Object value;
        private Node next;

        Node(Object value) {
            this.value = value;
            this.next = null;
        }
    }
}