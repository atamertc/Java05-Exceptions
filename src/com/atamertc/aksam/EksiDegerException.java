package com.atamertc.aksam;

public class EksiDegerException extends Exception {

    public EksiDegerException() {
    }

    @Override
    public String getMessage() {
        return "Eksi deger girilemez!!";
    }
}
