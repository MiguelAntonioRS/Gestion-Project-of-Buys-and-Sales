package com.capaLogica;

import com.capaData.MBuysDetails;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Antonio
 */
public class NBuysDetails {

    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";

    public DefaultTableModel showA(String buscar) {
        DefaultTableModel model;

        String[] tittles = {"ID", "ID Compra", "Producto", "Cantidad", "Precio", "Total"};
        model = new DefaultTableModel(null, tittles);
        String[] register = new String[6];
        sql = ("sp_listar_detalle_compra'" + buscar + "'");
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
    
    public boolean insert(MBuysDetails dts) {
        sql = ("{call sp_guardar_detalle_compra (?,?,?,?,?)}");

        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, dts.getIdBuys());
            pst.setString(2, dts.getIdProduct());
            pst.setInt(3, dts.getAmount());
            pst.setDouble(4, dts.getPrice());
            pst.setDouble(5, dts.getTotal());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            return false;
        }
    }
}
