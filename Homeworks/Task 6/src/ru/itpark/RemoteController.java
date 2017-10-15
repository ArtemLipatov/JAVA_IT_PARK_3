package ru.itpark;

public class RemoteController {

    public static void control() {
        Singleton tv = Singleton.getTv();
        while (true) {
            TV.showMenu();
            TV.remote(tv);
        }
    }
}