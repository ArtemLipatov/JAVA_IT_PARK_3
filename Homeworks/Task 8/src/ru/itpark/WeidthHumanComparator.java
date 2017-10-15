package ru.itpark;

public class WeidthHumanComparator implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        int c;
        c = a.getWeight() - b.getWeight();
        return c;
    }
}
