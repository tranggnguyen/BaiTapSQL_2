/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dieukhien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import quanlysach.Sach;

/**
 *
 * @author trant
 */
public class DieuKhienSach {

    DieuKhien dk = new DieuKhien();//khai báo phương thức lớp 

    public List<Sach> layDuLieu() throws SQLException {
        String sql = "select * from Sach";// lấy từ sql
        Statement smt = null;// statement tạo truy vấn
        ResultSet rs = null;//ResultSet lấy dl từ truy vấn
        List<Sach> listSach = new ArrayList<>();//tạo ra danh sách list
        try {
            Connection con = dk.ketNoiSQL();
            smt = con.createStatement();//TẠO TRUY VẤN
            rs = smt.executeQuery(sql);// lấy dl từ truy vấn
            while (rs.next()) {//chạy từng dlieu
                Sach s = new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));//gán từng dlieu vào sach
                listSach.add(s);// thêm sách vào danh sách
            }
            return listSach;// trả về dsach 
        } catch (SQLException ex) {//lấy lỗi
            System.out.println(ex);
        }
        return null;//trả về rỗng
    }

    public void themSach(Sach sach) {
        String sql = "insert into Sach values (?,?,?,?,?)";// lấy từ sql
        PreparedStatement smt = null;// statement tạo truy vấn

        try {
            Connection con = dk.ketNoiSQL();
            smt = con.prepareStatement(sql);//TẠO TRUY VẤN
            smt.setString(1, sach.getMaTaiLieu());
            smt.setString(2, sach.getNhaSanXuat());
            smt.setString(3, sach.getSoBanPhatHanh());
            smt.setString(4, sach.getTenTacGia());
            smt.setString(5, sach.getSoTrang());
            smt.execute();

        } catch (SQLException ex) {//lấy lỗi
            System.out.println(ex);
        }

    }

    public void xoaSach(Sach sach) throws SQLException {
        String sql = "delete from Sach where maTaiLieu=?";
        Connection con;
        PreparedStatement smt = null;
        try {
            con = dk.ketNoiSQL();
            smt = con.prepareCall(sql);
            smt.setString(1, sach.getMaTaiLieu());
            smt.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa thành công");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Sach timkimSach(Sach s) throws SQLException {
        List<Sach> listSach = new ArrayList<>();
        listSach = layDuLieu();
        for (Sach sach : listSach) {
            if (sach.getMaTaiLieu().equals(s.getMaTaiLieu())) {
                return sach;
            }
        }
        return null;

    }

}
