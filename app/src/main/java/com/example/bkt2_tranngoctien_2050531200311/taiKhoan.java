package com.example.bkt2_tranngoctien_2050531200311;

public class taiKhoan {
    private String ten,tuoi,tendangnhap,matkhau,nhaplaimatkhua;

    public taiKhoan(String ten, String tuoi, String tendangnhap, String matkhau, String nhaplaimatkhua) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.nhaplaimatkhua = nhaplaimatkhua;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getNhaplaimatkhua() {
        return nhaplaimatkhua;
    }

    public void setNhaplaimatkhua(String nhaplaimatkhua) {
        this.nhaplaimatkhua = nhaplaimatkhua;
    }
}
