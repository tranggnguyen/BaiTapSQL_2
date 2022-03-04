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
public class TapChi extends TaiLieu {

    private String soPhatHanh;
    private String thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maTaiLieu, String nhaSanXuat, String soBanPhatHanh,String soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, nhaSanXuat, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    

}
