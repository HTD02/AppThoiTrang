package com.example.tkgdpm.Model;

public class LienLac {
    public String avt, ten,tinnhancuoi;

    public LienLac(String avt, String ten, String tinnhancuoi) {
        this.avt = avt;
        this.ten = ten;
        this.tinnhancuoi = tinnhancuoi;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTinnhancuoi() {
        return tinnhancuoi;
    }

    public void setTinnhancuoi(String tinnhancuoi) {
        this.tinnhancuoi = tinnhancuoi;
    }
}
