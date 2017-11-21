package com.company.tasks;

import com.company.TextViewer;

public class PmTask extends Thread {

    TextViewer textViewer = new TextViewer();

    public PmTask(TextViewer textViewer) {
        this.textViewer = textViewer;
    }

    public void PmAsChar() {
        for (int i = 0; i < textViewer.getText().length(); i++) {
            int currentByte = textViewer.getText().charAt(i);
            if (currentByte >= 33 && currentByte <= 64 || currentByte >= 91 && currentByte <= 96
                    || currentByte >=123 && currentByte <=254) {
                System.out.println("Punctuation mark is:" + (char) currentByte  );
            }
        }
    }

    @Override
    public void run() {
        PmAsChar();
    }
}
