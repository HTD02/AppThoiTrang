package com.example.tkgdpm.Model;

public class TaiKhoanLive {
    public String anh, avt, ten, tieude;

    public TaiKhoanLive(String anh, String avt, String ten, String tieude) {
        this.anh = anh;
        this.avt = avt;
        this.ten = ten;
        this.tieude = tieude;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
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

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }
}
