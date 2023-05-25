package com.atamertc.sabah;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedOrnek {
    //Checked Exceptions: Kontrolu zorunlu olan exceptionlardir
    //Derleme zamaninda kontrolu zorunlu kilar
    //Bu kontrolu 2 yolla saglar
    //1. yol Try-Catch icine alarak
    //2. yol Icinde bulunulan metoda throws ekleyerek
    public static void main(String[] args) throws InterruptedException {
        FileInputStream file_data = null;
        try {
            file_data = new FileInputStream("D:/BilgeAdamBoost/JavaFiles/Hello.txt"); //CheckedException
            int m;
            while ((m = file_data.read()) != -1) {
                System.out.print((char)m);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("1. Catch blogundayiz");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("2. Catch blogundayiz");
        } finally { // Hata alsakta almasakta bu kisim calisacak kodlar
            try {
                file_data.close(); // Dosya acik kalirsa baska biri islem yapamicak
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Program calismaya devam ediyor");

        // Unhandled exception type FileNotFoundException
        // try/catch kullanmaya zorluyor

        Thread.sleep(1000); //InterruptedException
        System.out.println("Beklemeden sonra calismaya devam ediyor");
        // int sonuc = 5 / 0; //UncheckedException

    }

}
