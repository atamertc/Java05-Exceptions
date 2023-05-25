package com.atamertc.aksam;

import java.util.Scanner;

public class EksiDegerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            try {
                degerYazdir(scanner.nextInt());
            } catch (EksiDegerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void degerYazdir(int deger) throws EksiDegerException {
        if (deger < 0) {
            throw new EksiDegerException();
        }
        System.out.println(deger);
    }
}
