package com.capaLogica;

import com.capaData.MBuys;
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
public class NBuys {

    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";
    ResultSet rs;

    public DefaultTableModel showA() {
        DefaultTableModel modelo;

        String[] titulos = {"ID Producto", "Descripcion", "Cantidad", "Precio", "IGV", "Total"};
        modelo = new DefaultTableModel(null, titulos);
        String[] registro = new String[6];
        return modelo;
    }

    public DefaultTableModel showBuy(String search) {
        DefaultTableModel model;

        String[] tittles = {"ID Venta", "Cliente", "Fecha", "Empleado", "Comprobante", "Numero", "Estado", "Sub Total", "Impuesto", "Total"};
        model = new DefaultTableModel(null, tittles);
        String[] register = new String[10];
        sql = ("sp_listar_compras'" + search + "'");
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

    public boolean insert(MBuys dts) {
        String date;
        String hour;
        date = Functions.getDateActual();
        hour = Functions.getHourActual();

        sql = ("{call sp_guardar_compra (?,?,?,?,?,?,?,?,?,?)}");

        try {

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, date);
            pst.setString(2, hour);
            pst.setString(3, dts.getDocumentNumber());
            pst.setString(4, dts.getDocumentType());
            pst.setDouble(5, dts.getSubTotal());
            pst.setDouble(6, dts.getIgv());
            pst.setDouble(7, dts.getTotal());
            pst.setString(8, dts.getStatus());
            pst.setInt(9, dts.getIdUser());
            pst.setString(10, dts.getIdSupplier());

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

    public String IDBuy() {
        String idv = "";
        sql = ("SELECT MAX(idCompra) FROM compra");

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
        String sql = ("SELECT MAX(numDocumento) AS id FROM compras where tipoDocumento = 'Factura'");
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
        String sql = ("SELECT MAX(numDocumento) AS id FROM compras where tipoDocumento = 'Boleta'");
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
