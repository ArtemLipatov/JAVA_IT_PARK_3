package ru.itpark;

public class Main {

    public static void main(String[] args) {
        AgeHumanComparator ageCompare = new AgeHumanComparator();
        HeightHumanComparator heightCompare = new HeightHumanComparator();
        WeidthHumanComparator weigthCompare = new WeidthHumanComparator();


        Human a = new Human("Bob", 189, 20, 60);
        Human b = new Human("Dubich", 175, 22, 73);
        Human[] humans =  {a, b};

        System.out.println("Разница в возрасте равна: " + ageCompare.compare(a,b));
        System.out.println("Разница в росте равна: " + heightCompare.compare(a,b));
        System.out.println("Разница в весе равна: " +  weigthCompare.compare(a,b));

        for (int i = 0; i < humans.length; i++){

        }
    }
}
