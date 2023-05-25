package com.atamertc.aksam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {


    public static void main(String[] args) {

        System.out.println("Program burdan devam ediyor");
        System.out.println(bolme());
    }

    public static double bolme() {
        Scanner scanner = new Scanner(System.in);
        boolean kontrol = false;
        double sonuc = 0;
        do {
            try {
                System.out.println("Lütfen 1.sayıyı giriniz");
                int sayi1 = scanner.nextInt();
                System.out.println("Lütfen 2.sayıyı giriniz");
                int sayi2 = scanner.nextInt();
                sonuc = (sayi1 / sayi2);
                kontrol = false;
            } catch (ArithmeticException e) {
                System.out.println("2.sayıyı sıfır girdiniz" + e.getMessage());
                e.printStackTrace();
                kontrol = true;
            } catch (InputMismatchException ex) {
                System.out.println("Lütfen sadece sayı giriniz" + ex.getMessage());
                kontrol = true;
            } catch (Exception e) {
                System.out.println("Bir hata olustu:");
                kontrol = true;
            } finally {
                scanner.nextLine();
            }
        } while (kontrol);


        return sonuc;
    }
}

