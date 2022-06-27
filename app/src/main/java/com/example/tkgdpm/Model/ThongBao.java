package com.example.tkgdpm.Model;

public class ThongBao {
    public String tieude,noidung;

    public ThongBao(String tieude, String noidung) {
        this.tieude = tieude;
        this.noidung = noidung;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    @Override
    public String toString() {
        return "ThongBao{" +
                "tieude='" + tieude + '\'' +
                ", noidung='" + noidung + '\'' +
                '}';
    }
}
