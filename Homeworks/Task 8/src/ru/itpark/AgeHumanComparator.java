package ru.itpark;

import ru.itpark.Human;
import ru.itpark.HumanComparator;

public class AgeHumanComparator implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
            int c = a.getAge() - b.getAge();
            return c;
    }
}
