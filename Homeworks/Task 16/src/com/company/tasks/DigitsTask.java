package com.company.tasks;
import com.company.TextViewer;

public class DigitsTask extends Thread {
    TextViewer textViewer = new TextViewer();

    public DigitsTask(TextViewer textViewer) {
        this.textViewer = textViewer;
    }

    public void DigitsAsChar() {
        for (int i = 0; i < textViewer.getText().length(); i++) {
            char symbol = textViewer.getText().charAt(i);
            if (Character.isDigit(symbol)) {
                System.out.println("Digits is:" + +symbol);
            }
        }

    }


    @Override
    public void run() {
        DigitsAsChar();
    }
}
