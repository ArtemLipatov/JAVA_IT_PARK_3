package com.company;

import com.company.tasks.DigitsTask;
import com.company.tasks.LettersTask;
import com.company.tasks.PmTask;

public class Main {

    public static void main(String[] args) {
        TextViewer viewer = new TextViewer();
        viewer.setText("Hello, How are you. 123");
        viewer.addTask(new LettersTask(viewer));
        viewer.addTask(new DigitsTask(viewer));
        viewer.addTask(new PmTask(viewer));
        viewer.process();


    }
}
