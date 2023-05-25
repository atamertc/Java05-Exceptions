package com.atamertc.sabah;

public class ScoreOutOfBoundsException {

    public static void notKontrol(int not) throws UserDefinedException {
        if (not < 0 || not > 100) {
            throw new UserDefinedException();
        } else {
            System.out.println("Not sorunsuz");
        }
    }

    public static void main(String[] args) {
        try {
            notKontrol(123);
        } catch (UserDefinedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


        System.out.println("Program calisiyor");
    }


}
