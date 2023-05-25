package com.atamertc.sabah;

public class UnCheckedOrnek {
    // Kontrol edilmesi zorunlu olmayan exceptionlardir
    // Derleyici bu tur exceptionlari kontrol etmez
    // RuntimeExceptionlardir
    public static void main(String[] args) {

//        try {
//            int[] sayilar = {10, 20, 30, 40};
//            System.out.println(sayilar[4]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            //e.printStackTrace();
//            System.out.println("Array indexinde hata var");
//        }
//        System.out.println("Program calisiyor beyaaa");

        try {
//            String ad = "null";
//            System.out.println(ad.length());
            //Bu hatadan sonra altina yazilan kodlar calismaz direk catche duseriz
            System.out.println("Hata alirsan buraya yazilan kodlar calismayacak");
            String boy = "170cm";
            int i = Integer.parseInt(boy);
//        } catch (NullPointerException e) {
//            //e.printStackTrace();
//            System.out.println("Null bir nesnenin uzunlugu derken?");
        } catch (NumberFormatException e) {
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e);
            System.out.print("e.printStackTrace(): ");
            e.printStackTrace();
        }
        System.out.println("Program ep gene calisir");

    }
}
