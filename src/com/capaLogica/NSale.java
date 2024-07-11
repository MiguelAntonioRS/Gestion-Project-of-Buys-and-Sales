package com.capaLogica;

import com.capaData.MSale;
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
public class NSale {
    
    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";
    ResultSet rs;

    public DefaultTableModel see() {
        DefaultTableModel modelo;

        String[] tittles = {"ID Producto", "Descripcion", "Cantidad", "Precio", "IGV", "Total"};
        modelo = new DefaultTableModel(null, tittles);
        String[] registro = new String[6];
        return modelo;
    }

    public DefaultTableModel showSale(String search) {
        DefaultTableModel model;

        String[] tittles = {"ID Venta", "Cliente", "Fecha", "Empleado", "Comprobante", "Numero", "Estado", "Sub Total", "Impuesto", "Total"};
        model = new DefaultTableModel(null, tittles);
        String[] register = new String[10];
        sql = ("sp_listar_ventas'" + search + "'");
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
                register[9] = rs.getString(10);
                model.addRow(register);
            }
            return model;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }

    public boolean insert(MSale dts) {
        String date;
        String hour;
        date = Functions.getDateActual();
        hour = Functions.getHourActual();

        sql = ("{call sp_guardar_venta (?,?,?,?,?,?,?,?,?,?,?)}");

        try {

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, date);
            pst.setString(2, hour);
            pst.setString(3, dts.getSerie());
            pst.setString(4, dts.getDocumentNumber());
            pst.setString(5, dts.getDocumentType());
            pst.setDouble(6, dts.getSubtotal());
            pst.setDouble(7, dts.getIgv());
            pst.setDouble(8, dts.getTotal());
            pst.setString(9, dts.getStatus());
            pst.setInt(10, dts.getIdUser());
            pst.setString(11, dts.getIdClient());

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

    public String IDSale() {
        String idv = "";
        sql = ("SELECT MAX(idVentas) FROM ventas");

        try {
            PreparedStatement pst = cn.prepareStatement(idv);
            rs = pst.executeQuery();

            while (rs.next()) {
                rs.getString(1);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());

        }
        return idv;
    }

    public int generateComprobantFacture() {
        String sql = ("SELECT MAX(numDocumento) AS id FROM ventas where tipoDocumento = 'Factura'");
        int cod = 0;

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                cod = rs.getInt("id") + 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());

        }
        return cod;
    }

    public int generateComprobantBolet() {
        String sql = ("SELECT MAX(numDocumento) AS id FROM ventas where tipoDocumento = 'Boleta'");
        int cod = 0;

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                cod = rs.getInt("id") + 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());

        }
        return cod;
    }
}
