package com.atamertc.aksam;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Bir metot ile disaridan bir index alalim sonra o indexteki degeri yazdiralim
hata varsa try catch ile yakalayalim

array uzerinde gezerken toplayabildigimiz degerleri, toplama ekleyelim
bir sayac ile hata sayisini tutalim ve dongu sonunda da toplami ve hata sayisini
yazdiralim
 */
public class TryCatchOrnek2 {

    public static void main(String[] args) {

        String[] array = {"a", "30", "20", null, "abc", "50"};
//        indexAl(array);
//        System.out.println("Program devam ediyor");
//        topla(array);
//        System.out.println("Program devam ediyor2");
        for (String str : array) {
            nullCheck(str);
        }
        for (String str : array) {
            try {
                nullCheck2(str);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static String nullCheck(String str) { //unchecked exception
        if (str == null) {
            throw new NullPointerException(); //throwda return gibi calisir
        }
        return str;
    }

    public static String nullCheck2(String str) throws Exception { //checked exception
        if (str == null) {
            throw new NullPointerException(); //throwda return gibi calisir
        }
        return str;
    }

    public static void topla(String[] array) {
        int count = 0;
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                toplam += Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                count++;
                System.out.println("Sayi formati toplanmaya uygun degil");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Baska bir hata");
                e.printStackTrace();
            }
        }
        System.out.println("Toplam= " + toplam);
        System.out.println("NumberFormatException sayisi= " + count);
    }

    public static void indexAl(String[] array) {
        Scanner scanner = new Scanner(System.in);
        try {
            int index = scanner.nextInt();
            System.out.println("Value of index: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index numarasi array boyutunu asti");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Girdi tipi degisken tipiyle eslesmiyor");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }


}
