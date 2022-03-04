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
public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao() {
    }

    public Bao( String maTaiLieu, String nhaSanXuat, String soBanPhatHanh,String ngayPhatHanh) {
        super(maTaiLieu, nhaSanXuat, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    
}
