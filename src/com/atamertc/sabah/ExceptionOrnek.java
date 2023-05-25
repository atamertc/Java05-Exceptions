package com.atamertc.sabah;

public class ExceptionOrnek {

    public static void main(String[] args) {

        sifiraBolmeIslemi();

        //-> Exception in thread "main": Main thread;de bir exception meydana geldi
        //-> java.lang.ArithmeticException: Bu exceptionu'i firlatan sinif
        //-> / by zero: Sifira bolme hatasi
        //-> com.atamertc.sabah.ExceptionOrnek.main: Hatanin olustugu SinifAdi.metodAdi
        //-> (ExceptionOrnek.java:9): Hatanin olustugu satir
    }

    private static void sifiraBolmeIslemi() {
        int payda = 0;
        int pay = 20;
        int sonuc = pay / payda;
        System.out.println(sonuc);
    }
}
