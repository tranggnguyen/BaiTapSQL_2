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
public class Sach extends TaiLieu {

    private String tenTacGia;
    private String soTrang;

    public Sach() {
    }

    public Sach( String maTaiLieu, String nhaSanXuat, String soBanPhatHanh,String tenTacGia, String soTrang) {
        super(maTaiLieu, nhaSanXuat, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }

    public void xoaSach(Sach sach) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
