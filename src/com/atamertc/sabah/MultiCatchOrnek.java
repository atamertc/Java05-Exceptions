package com.atamertc.sabah;

import java.util.Scanner;

public class MultiCatchOrnek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int bolen = sc.nextInt();
            int sonuc = 20 / bolen;

            int[] dizi = {10, 5, 2, 3};
            System.out.println(dizi[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally calisti");
        }

        System.out.println("Program calisiyor");
    }
}
