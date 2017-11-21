package com.company;

import com.company.tasks.DigitsTask;
import com.company.tasks.LettersTask;
import com.company.tasks.PmTask;

public class TextViewer {

    // не обязательно Runnable
    private Thread tasks[] = new Thread[16];
    private String text;
    private int tasksCount = 0;


    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


    public void addTask(Thread task) {
        tasks[tasksCount] = task;
        tasksCount++;
    }

    public void process() {
        for (int i = 0; i < tasksCount; i++) {
            tasks[i].start();
        }
    }

}

