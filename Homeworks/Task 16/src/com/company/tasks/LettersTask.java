package com.company.tasks;

import com.company.TextViewer;


public class LettersTask extends Thread  {
    TextViewer textViewer = new TextViewer();

    public LettersTask(TextViewer textViewer) {
        this.textViewer = textViewer;
    }

    public void LettersAsChar() {

        for (int i = 0; i < textViewer.getText().length(); i++) {
            int currentByte = textViewer.getText().charAt(i);
            if (currentByte >= 'A' && currentByte <= 'Z' || currentByte >= 'a' && currentByte <= 'z') {
                System.out.println("Letter is:" + (char) currentByte);
            }
        }
    }

    @Override
    public void run() {
        LettersAsChar();
    }
}
