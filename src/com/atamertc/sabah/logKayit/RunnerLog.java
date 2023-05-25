package com.atamertc.sabah.logKayit;

public class RunnerLog {
    static DosyaIslemleri<Log> dosyaIslemleri = new DosyaIslemleri();
    public static void main(String[] args) {

        try {
            System.out.println(dosyaIslemleri.lokOku("filename"));
            String metin = null;
            String parcaMetin = metin.substring(5);

        } catch (NullPointerException e) {
            System.out.println("Islem yapmaya calistiginiz degisken null");
            Log log = new Log(e.toString(), "RunnerLog", "Main",
                    "9. satirda null pointer olustu", System.currentTimeMillis());
            dosyaIslemleri.logKaydet(log,"filename");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
