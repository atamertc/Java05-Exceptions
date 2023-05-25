package com.atamertc.sabah.logKayit;

import java.util.Optional;

public class RunnerOtomobil {

    static DosyaIslemleri<Otomobil> dosya = new DosyaIslemleri<>();

    public static void main(String[] args) {

        Otomobil oto1 = new Otomobil("Oto1", "Model1", 1995);

        dosya.logKaydet(oto1,"D:\\BilgeAdamBoost\\JavaFiles\\otomobil.bin");

        Optional<Otomobil> oto = dosya.lokOku("D:\\BilgeAdamBoost\\JavaFiles\\otomobil.bin");
        if (oto.isPresent()) {
            System.out.println(oto.get().toString());
        } else {
            System.out.println("Oto kaydi yok");
        }


    }
}
