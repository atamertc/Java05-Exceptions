package com.atamertc.sabah.logKayit;

import java.io.Serializable;

public class Log implements Serializable {
    String id;
    String errorMessage;
    String classAd;
    String metodAd;
    String detay;
    Long timeStamp; //zaman damgasi

    public Log(String errorMessage, String classAd, String metodAd, String detay, Long timeStamp) {
        this.errorMessage = errorMessage;
        this.classAd = classAd;
        this.metodAd = metodAd;
        this.detay = detay;
        this.timeStamp = timeStamp;
    }

    public Log() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getClassAd() {
        return classAd;
    }

    public void setClassAd(String classAd) {
        this.classAd = classAd;
    }

    public String getMetodAd() {
        return metodAd;
    }

    public void setMetodAd(String metodAd) {
        this.metodAd = metodAd;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id='" + id + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", classAd='" + classAd + '\'' +
                ", metodAd='" + metodAd + '\'' +
                ", detay='" + detay + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
