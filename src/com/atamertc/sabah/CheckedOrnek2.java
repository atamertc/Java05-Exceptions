package com.atamertc.sabah;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedOrnek2 {
    public static void main(String[] args) {
        try {
            dosyaOkuma();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Program devam ediyor");


    }

    public static void dosyaOkuma() throws IOException {
        FileInputStream file_data = null;

        file_data = new FileInputStream("D:/BilgeAdamBoost/JavaFiles/Hello.txt");

        int m;
        while ((m = file_data.read()) != -1) {
            System.out.print((char)m);
        }
        file_data.close();
    }
}
