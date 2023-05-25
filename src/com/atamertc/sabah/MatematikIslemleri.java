package com.atamertc.sabah;

import java.util.Scanner;

public class MatematikIslemleri {

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 5;

        try {
            islemler(sayi1,sayi2);
        } catch (WrongChoiceException e) {
            e.printStackTrace();
        }
        System.out.println("Program calisiyor");
    }

    public static void islemler(int sayi1, int sayi2) throws WrongChoiceException{
        Scanner sc = new Scanner(System.in);
        String menu = "Matematik islemleri\n" +
                "1-Toplama\n" +
                "2-Carpma\n" +
                "3-Bolme\n" +
                "4-Cikarma\n" +
                "0-Cikis";

        int secim = 0;
        do {
            System.out.println(menu);
            System.out.println("Menuden bir secim yapiniz");
            secim = sc.nextInt();
            sc.nextLine();
            switch (secim) {
                case 1 -> {
                    System.out.println(sayi1+sayi2);
                }
                case 2 -> {
                    System.out.println(sayi1*sayi2);
                }
                case 3 -> {
                    System.out.println(sayi1/sayi2);
                }
                case 4 -> {
                    System.out.println(sayi1-sayi2);
                }
                case 0 -> {
                    System.out.println("Cikis yapildi");
                }
                default -> throw new WrongChoiceException();
            }
        } while (secim != 0);

    }


}
