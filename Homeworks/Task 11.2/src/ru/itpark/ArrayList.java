package ru.itpark;

public class ArrayList implements List {
    private static final int MAX_SIZE = 10;
    private Object elements[];
    private int count;

    public ArrayList() {
        this.elements = new Object[MAX_SIZE];
        this.count = 0;
    }

    @Override
    public void addToBegin(Object element) {
        if (count < MAX_SIZE) {
            for (int i = elements.length - 1; i > 0; i--) {
                elements[i] = elements[i - 1];
            }
            elements[0] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }

    @Override
    public void addToEnd(Object element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }

    @Override
    public void howMany() {
        int a = 0;
        ArrayListIterator iterator = new ArrayListIterator();
        while (iterator.hasNext()) {
            iterator.next();
            a++;
        }
        System.out.println("В списке " + a + " элементов");
    }

    @Override
    public void addByIndex(Object element, int index) {
        if (count < MAX_SIZE) {
            for (int i = count - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }

    public void insertByIndex(int element, int index) {
        elements[index] = element;
    }

    @Override
    public void reverse() {
        for (int i = 0; i < count / 2; i++) {
            Object temp = elements[i];
            elements[i] = elements[count - 1 - i];
            elements[count - 1 - i] = temp;
        }
    }

    @Override
    public void deleteByIndex(int index) {
        if (count != 0) {
            for (int i = index; i < count; i++) {
                elements[i] = elements[i + 1];
            }
            elements[count] = 0;
            count--;
        } else {
            System.err.println("Список пуст");
        }
    }

    @Override
    public void deleteLast() {
        if (count != 0) {
            elements[count] = 0;
            count--;
        } else {
            System.err.println("Список пуст");
        }
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {

        private int current;

        public ArrayListIterator() {
            current = 0;
        }

        @Override
        public Object next() {
            Object element = elements[current];
            current++;
            return element;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }
}