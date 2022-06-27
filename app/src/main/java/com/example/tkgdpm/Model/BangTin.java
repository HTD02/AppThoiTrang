package com.example.tkgdpm.Model;

public class BangTin {
    String ten, avt ,diachi , anh, noidung;

    public BangTin(String ten, String avt, String diachi, String anh, String noidung) {
        this.ten = ten;
        this.avt = avt;
        this.diachi = diachi;
        this.anh = anh;
        this.noidung = noidung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
