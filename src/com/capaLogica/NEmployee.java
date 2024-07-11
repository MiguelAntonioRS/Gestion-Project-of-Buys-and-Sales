package com.capaLogica;

import com.capaData.MEmployee;
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
public class NEmployee {

    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";

    public DefaultTableModel showA(String search) {
        DefaultTableModel model;

        String[] tittles = {"Codigo", "Nombre", "Apellidos", "DNI", "Telefono", "Direccion"};
        model = new DefaultTableModel(null, tittles);
        String[] register = new String[8];
        sql = ("sp_buscar_empleados'" + search + "'");
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
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }

    public boolean insert(MEmployee dts) {

        sql = ("{call sp_guardar_empleados (?,?,?,?,?,?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdEmployee());
            pst.setString(2, dts.getFirstName());
            pst.setString(3, dts.getLastName());
            pst.setString(4, dts.getDni());
            pst.setString(5, dts.getPhone());
            pst.setString(6, dts.getDirection());

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
    
    public boolean edit(MEmployee dts) {

        sql = ("{call sp_editar_empleados (?,?,?,?,?,?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdEmployee());
            pst.setString(2, dts.getFirstName());
            pst.setString(3, dts.getLastName());
            pst.setString(4, dts.getDni());
            pst.setString(5, dts.getPhone());
            pst.setString(6, dts.getDirection());

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
    
    public boolean delete(MEmployee dts) {

        sql = ("{call sp_eliminar_empleados (?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdEmployee());

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
    
    public int generateIDEmployee(){
        String sql = ("SELECT MAX(idEmpleados) AS id FROM empleados");
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
