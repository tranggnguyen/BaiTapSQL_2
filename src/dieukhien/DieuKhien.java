/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dieukhien;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author trant
 */
public class DieuKhien {

    public Connection ketNoiSQL() {// connection là biến để kết nối

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setServerName("LAPTOP-TS26SMTG\\TTRANG");
        ds.setPortNumber(1433);
        ds.setDatabaseName("sqll");
        ds.setEncrypt(false);
        ds.setTrustServerCertificate(false);

   

        try {//SAU KHI KẾT NỐI
            System.out.println("ket noi thanh cong");
            return ds.getConnection();//kn thành công trả veed dữ liệu sever
        } catch (SQLException ex) {// lấy lỗi 
            System.out.println(ex);
        }
        return null;// trả ve null
    }

   
    
}
