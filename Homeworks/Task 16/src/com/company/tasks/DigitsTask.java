package com.company.tasks;
import com.company.TextViewer;

public class DigitsTask extends Thread {
    TextViewer textViewer = new TextViewer();

    public DigitsTask(TextViewer textViewer) {
        this.textViewer = textViewer;
    }

    public void DigitsAsChar() {
        for (int i = 0; i < textViewer.getText().length(); i++) {
            int currentByte = textViewer.getText().charAt(i);
            if (currentByte >= '0' && currentByte <= '9') {
                System.out.println("Digits is:" + (char) currentByte);
            }
        }
    }

    @Override
    public void run() {
        DigitsAsChar();
    }
}
