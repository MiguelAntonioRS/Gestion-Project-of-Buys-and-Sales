package com.capaLogica;

import com.capaData.MSaleDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Antonio
 */
public class NSaleDetails {
    
    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";

    public DefaultTableModel showA(String search) {
        DefaultTableModel model;

        String[] tittles = {"ID Venta", "ID Producto", "Producto", "Cantidad", "Precio Venta", "Total"};
        model = new DefaultTableModel(null, tittles);
        String[] register = new String[6];
        sql = ("sp_listar_detalle_venta'" + search + "'");
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                register[0] = rs.getString(1);
                register[1] = rs.getString(2);
                register[2] = rs.getString(3);
                register[3] = rs.getString(4);
                register[4] = rs.getString(5);
                register[5] = rs.getString(6);
                model.addRow(register);
            }
            return model;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }
    
    public boolean insert(MSaleDetails dts) {
        sql = ("{call sp_guardar_detalle_venta (?,?,?,?,?)}");

        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, dts.getIdSale());
            pst.setString(2, dts.getIdProduct());
            pst.setInt(3, dts.getQuantity());
            pst.setDouble(4, dts.getPrice());
            pst.setDouble(5, dts.getTotal());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
