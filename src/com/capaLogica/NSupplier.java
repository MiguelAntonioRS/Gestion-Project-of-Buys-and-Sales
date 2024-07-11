package com.capaLogica;

import com.capaData.MSupplier;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Antonio
 */
public class NSupplier {

    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";

    public DefaultTableModel showA(String search) {
        DefaultTableModel model;

        String[] tittles = {"ID", "Razon Social", "RUC", "Telefono", "Direccion"};
        model = new DefaultTableModel(null, tittles);
        String[] register = new String[5];

        sql = ("sp_buscar_proveedor'" + search + "'");

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                register[0] = rs.getString(1);
                register[1] = rs.getString(2);
                register[2] = rs.getString(3);
                register[3] = rs.getString(4);
                register[4] = rs.getString(5);
                model.addRow(register);

            }
            return model;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }

    public boolean insert(MSupplier dts) {

        sql = ("{call sp_guardar_proveedor (?,?,?,?,?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdSupplier());
            pst.setString(2, dts.getSocialRazon());
            pst.setString(3, dts.getRuc());
            pst.setString(4, dts.getPhone());
            pst.setString(5, dts.getAddress());

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

    public boolean edit(MSupplier dts) {

        sql = ("{call sp_editar_proveedor (?,?,?,?,?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdSupplier());
            pst.setString(2, dts.getSocialRazon());
            pst.setString(3, dts.getRuc());
            pst.setString(4, dts.getPhone());
            pst.setString(5, dts.getAddress());

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

    public boolean delete(MSupplier dts) {

        sql = ("{call sp_eliminar_proveedor (?)}");
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdSupplier());

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
    
    public int generateIDSupplier(){
        String sql = ("SELECT MAX(idProveedor) AS id FROM proveedor");
        int cod = 0;
        
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                cod = rs.getInt("id")+1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
            
        }
        return cod;
    }
}
