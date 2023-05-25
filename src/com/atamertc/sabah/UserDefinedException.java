package com.atamertc.sabah;

public class UserDefinedException extends Exception {
    //Checked yapmak istersen Exceptiondan miras al
    //UnChecked yapmak istersen RuntimeExceptiondan miras al
    //Birde bos constructor ekledin mi al sana yeni kisiye ozel exception
    public UserDefinedException() {

    }

    @Override
    public String getMessage() {
        return "0-100 arasinda bir not girilmeli";
    }


}
