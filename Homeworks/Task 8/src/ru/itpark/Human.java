package ru.itpark;

public class Human {
    public Human(String name, int height, int age, int weight) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 1;
        }
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }

        if (weight > 0) {

            this.weight = weight;
        } else {
            this.weight = 1;
        }
    }

    private String name;
    private int height;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public static class HumanSelectionSorter implements HumanSorter {
        @Override
        public void sort(HumanComparator comparator, Human[] humans) {
            for (int i = 0; i < humans.length; i++) {
                Human min = humans[i];
                int indexOfMinHuman = i;
                for (int j = i; j < humans.length; j++) {
                    if (comparator.compare(humans[j], min) < 0) {
                        min = humans[j];
                        indexOfMinHuman = j;
                    }
                }
                Human temp = humans[i];
                humans[i] = min;
                humans[indexOfMinHuman] = temp;
            }
        }
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}



