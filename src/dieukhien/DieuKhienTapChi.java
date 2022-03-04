/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dieukhien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import quanlysach.Sach;
import quanlysach.TapChi;

/**
 *
 * @author trant
 */
public class DieuKhienTapChi {
    DieuKhien dk = new DieuKhien();
    public List<TapChi> layDuLieu() throws SQLException {
        String sql = "select * from TaiLieu";// lấy từ sql
        Statement smt = null;// statement tạo truy vấn
        ResultSet rs = null;//ResultSet lấy dl từ truy vấn
        List<TapChi> listTapChi = new ArrayList<>();//tạo ra danh sách list
        try {
            Connection con = dk.ketNoiSQL();
            smt = con.createStatement();//TẠO TRUY VẤN
            rs = smt.executeQuery(sql);// lấy dl từ truy vấn
            while (rs.next()) {//chạy từng dlieu
                TapChi tc = new TapChi(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));//gán từng dlieu vào sach
                listTapChi.add(tc);// thêm sách vào danh sách
            }
            return listTapChi;// trả về dsach 
        } catch (SQLException ex) {//lấy lỗi
            System.out.println(ex);
        }
        return null;//trả về rỗng
    }

    public void themTapChi(TapChi tapchi) {
        String sql = "insert into TaiLieu values (?,?,?,?,?)";// lấy từ sql
        PreparedStatement smt = null;// statement tạo truy vấn

        try {
            Connection con = dk.ketNoiSQL();
            smt = con.prepareStatement(sql);//TẠO TRUY VẤN
            smt.setString(1, tapchi.getMaTaiLieu());
            smt.setString(2, tapchi.getNhaSanXuat());
            smt.setString(3, tapchi.getSoBanPhatHanh());
            smt.setString(4, tapchi.getSoPhatHanh());
            smt.setString(5, tapchi.getThangPhatHanh());
            smt.execute();

        } catch (SQLException ex) {//lấy lỗi
            System.out.println(ex);
        }

    }

    public void xoaTapChi(TapChi tapchi) throws SQLException {
        String sql = "delete from TaiLieu where maTaiLieu=?";
        Connection con;
        PreparedStatement smt = null;
        try {
            con = dk.ketNoiSQL();
            smt = con.prepareCall(sql);
            smt.setString(1, tapchi.getMaTaiLieu());
            smt.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa thành công");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public TapChi timkiemTapChi(TapChi s) throws SQLException {
        List<TapChi> listTapChi = new ArrayList<>();
        listTapChi= layDuLieu();
        for (TapChi tapchi : listTapChi) {
            if (tapchi.getMaTaiLieu().equals(s.getMaTaiLieu())) {
                return tapchi;
            }
        }
        return null;

    }

}


