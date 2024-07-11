package com.capaLogica;

import com.capaData.MProduct;
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
public class NProduct {

    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";

    public DefaultTableModel showA(String search) {
        DefaultTableModel model;

        String[] tittles = {"ID", "Serie", "Nombre", "Fecha de Ingreso", "Fecha de Vencimiento", "Precio Compra",
            "Precio Venta", "Cantidad", "ID Categoria", "Categoria"};
        model = new DefaultTableModel(null, tittles);
        String[] register = new String[10];
        sql = ("sp_listar_producto'" + search + "'");
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

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
            return null;
        }
    }

    public boolean insert(MProduct dts) {

        sql = ("{call sp_guardar_producto (?,?,?,?,?,?,?,?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdProduct());
            pst.setString(3, dts.getName());
            pst.setString(2, dts.getSerie());
            pst.setDate(4, dts.getfIncome());
            pst.setDate(5, dts.getfExpiration());
            pst.setDouble(6, dts.getpBuys());
            pst.setDouble(7, dts.getpSale());
            pst.setInt(8, dts.getIdCategory());

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

    public boolean edit(MProduct dts) {

        sql = ("{call sp_editar_producto (?,?,?,?,?,?,?,?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdProduct());
            pst.setString(2, dts.getName());
            pst.setString(3, dts.getSerie());
            pst.setDate(4, dts.getfIncome());
            pst.setDate(5, dts.getfExpiration());
            pst.setDouble(6, dts.getpBuys());
            pst.setDouble(7, dts.getpSale());
            pst.setInt(8, dts.getIdCategory());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean delete(MProduct dts) {
        
        sql = ("{call sp_eliminar_producto (?)}");

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getIdProduct());

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

    public int generateIDProduct() {
        String sql = ("SELECT MAX(idProducto) AS id FROM productos");
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

    public boolean rest(int idProduct, int amount) {

        sql = "update productos set cantidad=cantidad-?"
                + "where idProducto = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, amount);
            pst.setInt(2, idProduct);

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
    
    public boolean sum(int idProduct, int amount) {

        sql = "update productos set cantidad=cantidad+?"
                + "where idProducto = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, amount);
            pst.setInt(2, idProduct);

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
