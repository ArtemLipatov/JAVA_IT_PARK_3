package com.company.tasks;

import com.company.TextViewer;


public class LettersTask extends Thread  {
    TextViewer textViewer = new TextViewer();

    public LettersTask(TextViewer textViewer) {
        this.textViewer = textViewer;
    }

    public void LettersAsChar() {

        for (int i = 0; i < textViewer.getText().length(); i++) {
            char symbol = textViewer.getText().charAt(i);
            if (Character.isLetter(symbol)) {
                System.out.println("Letter is:" + +symbol);
            }
        }
    }

    @Override
    public void run() {
        LettersAsChar();
    }
}
