package com.atamertc.sabah.logKayit;

import java.io.*;
import java.util.Optional;

public class DosyaIslemleri<T> {

    public void logKaydet(T t, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(t);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Optional ile bos log dosyasinin hatasini engellemeye calis
    //Loglar dosyasi bossa hata veriyor

    public Optional<T> lokOku(String fileName) {
        T tOkunan = null;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
            tOkunan = (T) input.readObject();
            return Optional.of(tOkunan);
        } catch (Exception e) {
            System.out.println("Dosya isleme hatasi " + e.toString());
            return Optional.empty();
        }
    }


}