package com.capaLogica;

import com.capaData.MUser;
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
public class NUser {
    
    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";
    public int registerTotal;
    
    public DefaultTableModel showA(String search) {
        DefaultTableModel model;

        String[] tittles = {"ID Usuario", "ID Empleado", "Nombre", "Apellidos", "Usuario", "Acceso", "Contraseña", "Estado"};
        model = new DefaultTableModel(null, tittles);
        String[] register = new String[8];
        sql = ("sp_listar_usuario'" + search + "'");
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
                register[6] = rs.getString(7);
                register[7] = rs.getString(8);
                model.addRow(register);
            }
            return model;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }
    
    public boolean insert(MUser dts) {

        sql = ("{call sp_guardar_usuarios (?,?,?,?,?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdEmployee());
            pst.setString(2, dts.getUser());
            pst.setString(3, dts.getPassword());
            pst.setString(4, dts.getAccess());
            pst.setString(5, dts.getStatus());

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
    
    public boolean edit(MUser dts) {

        sql = ("{call sp_editar_usuarios (?,?,?,?,?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdEmployee());
            pst.setString(2, dts.getUser());
            pst.setString(3, dts.getPassword());
            pst.setString(4, dts.getAccess());
            pst.setString(5, dts.getStatus());

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
    
    public boolean delete(MUser dts) {

        sql = ("{call sp_eliminar_usuarios (?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, dts.getIdUser());

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
    
    public DefaultTableModel log(String user, String password) {
        DefaultTableModel modelo;

        String[] titulos = {"ID Usuario", "ID Empleado", "Nombre", "Apellidos", "Usuario", "Contraseña", "Acceso", "Estado"};
        modelo = new DefaultTableModel(null, titulos);
        String[] registro = new String[8];
        sql = ("sp_sesion'" + user + "','" + password + "'");
        registerTotal = 0;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);
                registerTotal = registerTotal+1;
                modelo.addRow(registro);
            }
            return modelo;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }
}    
