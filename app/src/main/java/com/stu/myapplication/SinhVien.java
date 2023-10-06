package com.stu.myapplication;

import java.io.Serializable;

public class SinhVien implements Serializable {
    int MSSV;
    String HoTen, NgaySinh;

    public SinhVien(int MSSV, String hoTen, String ngaySinh) {
        this.MSSV = MSSV;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }
}
