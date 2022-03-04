/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

/**
 *
 * @author trant
 */
public class TaiLieu {

    private String maTaiLieu;
    private String nhaSanXuat;
    private String soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String nhaSanXuat, String soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaSanXuat = nhaSanXuat;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(String soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
}
