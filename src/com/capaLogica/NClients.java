package com.capaLogica;

import com.capaData.MClients;
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
public class NClients {

    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";

    public DefaultTableModel showA(String search) {
        DefaultTableModel model;

        String[] titles = {"ID", "Nombre", "Apellidos", "DNI", "Edad", "RUC", "Sexo", "Telefono", "Direccion"};
        model = new DefaultTableModel(null, titles);
        String[] register = new String[9];
        sql = ("sp_buscar_clientes'" + search + "'");
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
                register[8] = rs.getString(9);
                model.addRow(register);
            }
            return model;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }

    public boolean insert(MClients dts) {
        sql = ("{call sp_guardar_clientes (?,?,?,?,?,?,?,?,?)}");

        try {
            
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getCodigo());
            pst.setString(2, dts.getNombres());
            pst.setString(3, dts.getApellidos());
            pst.setString(4, dts.getDni());
            pst.setInt(5, dts.getEdad());
            pst.setString(6, dts.getRuc());
            pst.setString(7, dts.getSexo());
            pst.setString(8, dts.getTelefono());
            pst.setString(9, dts.getDireccion());

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

    public boolean edit(MClients dts) {
        sql = ("{call sp_editar_clientes (?,?,?,?,?,?,?,?,?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getCodigo());
            pst.setString(2, dts.getNombres());
            pst.setString(3, dts.getApellidos());
            pst.setString(4, dts.getDni());
            pst.setInt(5, dts.getEdad());
            pst.setString(6, dts.getRuc());
            pst.setString(7, dts.getSexo());
            pst.setString(8, dts.getTelefono());
            pst.setString(9, dts.getDireccion());

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

    public boolean delete(MClients dts) {
        sql = ("{call sp_eliminar_clientes (?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getCodigo());

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
    
    public int generateIDClient(){
        String sql = ("SELECT MAX(idClientes) AS id FROM clientes");
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
