package com.atamertc.sabah;

public class WrongChoiceException extends Exception {

    public WrongChoiceException() {
    }

    @Override
    public String getMessage() {
        return "Yanlis bir secim yaptiniz";
    }
}
