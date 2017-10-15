package ru.itpark;

public class HeightHumanComparator implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        int c;
        c = a.getHeight() - b.getHeight();
        return c;
    }
}

