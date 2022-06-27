package com.example.tkgdpm.Model;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String anh, ten,gia,mausac,shop,tinhtrang;

    public SanPham(String anh, String ten, String gia, String mausac, String shop, String tinhtrang) {
        this.anh = anh;
        this.ten = ten;
        this.gia = gia;
        this.mausac = mausac;
        this.shop = shop;
        this.tinhtrang = tinhtrang;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
}
