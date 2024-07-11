package com.capaLogica;

import com.capaData.MCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Miguel Antonio
 */
public class NCategory {
    
    private CConnetion SQL = new CConnetion();
    private Connection cn = SQL.getconec();
    String sql = "";
    
    public boolean insert(MCategory dts){
        
        sql = ("{call registrarCategoria (?)}");
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, dts.getnCategory());
            
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
