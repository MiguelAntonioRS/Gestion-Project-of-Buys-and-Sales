package com.capaPresentacion;

/**
 *
 * @author Miguel Antonio
 */
public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
        this.setTitle("Menu de Sistema de Compras y Ventas");
        this.setExtendedState(FrmMenu.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblIdUser = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        mnuStorage = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        mnuBuys = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        mnuSale = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuConsultation = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuConfig = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuReport = new javax.swing.JMenu();
        mnuHelp = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(245, 129, 100));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        lblIdUser.setBackground(new java.awt.Color(0, 0, 0));
        lblIdUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblIdUser.setText("jLabel2");

        lblFirstName.setBackground(new java.awt.Color(0, 0, 0));
        lblFirstName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFirstName.setText("jLabel2");

        lblLastName.setBackground(new java.awt.Color(0, 0, 0));
        lblLastName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLastName.setText("jLabel2");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(lblIdUser)
                .addGap(63, 63, 63)
                .addComponent(lblFirstName)
                .addGap(35, 35, 35)
                .addComponent(lblLastName)
                .addContainerGap(546, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(447, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblIdUser)
                    .addComponent(lblFirstName)
                    .addComponent(lblLastName))
                .addGap(14, 14, 14))
        );

        mnuFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/homepage1_114609.png"))); // NOI18N
        mnuFile.setMnemonic('f');
        mnuFile.setText("Inicio");

        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/systemshutdown_103390.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Cerrar Sesion");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        mnuFile.add(openMenuItem);

        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/exit_closethesession_close_6317.png"))); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Salir");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        mnuFile.add(saveMenuItem);

        menuBar.add(mnuFile);

        mnuStorage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/shoppaymentorderbuy-10_icon-icons.com_73874.png"))); // NOI18N
        mnuStorage.setMnemonic('e');
        mnuStorage.setText("Almacen");

        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/shipping_products_22121.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Productos");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        mnuStorage.add(cutMenuItem);

        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/iconfinder-654-categories-check-list-listing-mark-4017597_113091.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Categorias");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        mnuStorage.add(copyMenuItem);

        menuBar.add(mnuStorage);

        mnuBuys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/shoppingcart_accept_compra_12832.png"))); // NOI18N
        mnuBuys.setMnemonic('h');
        mnuBuys.setText("Compras");

        contentsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/warehause_products_safety_5996.png"))); // NOI18N
        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Compras");
        contentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsMenuItemActionPerformed(evt);
            }
        });
        mnuBuys.add(contentsMenuItem);

        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/blue_users_customers_clients_people_12438.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Proveedores");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        mnuBuys.add(aboutMenuItem);

        menuBar.add(mnuBuys);

        mnuSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/black_friday_sales_tag_sale_offers_deals_icon_159225.png"))); // NOI18N
        mnuSale.setText("Ventas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/offer_discount_sales_pay_online_icon_227992.png"))); // NOI18N
        jMenuItem1.setText("Ventas");
        mnuSale.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/User_Group-80_icon-icons.com_57247.png"))); // NOI18N
        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuSale.add(jMenuItem2);

        menuBar.add(mnuSale);

        mnuConsultation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/barchart_statistics_diagram_icon_187071.png"))); // NOI18N
        mnuConsultation.setText("Consultas");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/report_data_analytics_user_interface_statistics_website_browser_bar_chart_dashboard_icon_210838.png"))); // NOI18N
        jMenuItem3.setText("Ventas Realizadas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuConsultation.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/37_104846.png"))); // NOI18N
        jMenuItem4.setText("Compras Realizadas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuConsultation.add(jMenuItem4);

        menuBar.add(mnuConsultation);

        mnuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/apps_network_config_15750.png"))); // NOI18N
        mnuConfig.setText("Configuraciones");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/profile_config_icon_149889.png"))); // NOI18N
        jMenuItem5.setText("Config. Usuarios");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnuConfig.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/employee_group_solid_icon_235378.png"))); // NOI18N
        jMenuItem6.setText("Empleados");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnuConfig.add(jMenuItem6);

        menuBar.add(mnuConfig);

        mnuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Reports_25409.png"))); // NOI18N
        mnuReport.setText("Reportes");
        menuBar.add(mnuReport);

        mnuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/sign-question-icon_34359.png"))); // NOI18N
        mnuHelp.setText("Ayuda");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/sign-info-icon_34361.png"))); // NOI18N
        jMenuItem7.setText("Ayuda");
        mnuHelp.add(jMenuItem7);

        menuBar.add(mnuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed

        FrmCategory form = new FrmCategory();
        container.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed

        FrmProduct form = new FrmProduct();
        container.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed

        frmSupplier form = new frmSupplier();
        container.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        FrmClient form = new FrmClient();
        container.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        FrmEmployee form = new FrmEmployee();
        container.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        FrmUsers form = new FrmUsers();
        container.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        dispose();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed

        FrmLogIn form = new FrmLogIn();
        form.setVisible(true);
        form.pack();
        this.setVisible(false);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void contentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsMenuItemActionPerformed

        FrmBuys form = new FrmBuys();
        container.add(form);
        form.toFront();
        form.setVisible(true);
        FrmBuys.txtIdUser.setText(lblIdUser.getText());
        FrmBuys.txtFirstNameUser.setText(lblFirstName.getText() + " " + lblLastName.getText());
    }//GEN-LAST:event_contentsMenuItemActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
        FrmBuysDetails form = new FrmBuysDetails();
        container.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        FrmSaleDetails form = new FrmSaleDetails();
        container.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JPanel container;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    public static javax.swing.JLabel lblFirstName;
    public static javax.swing.JLabel lblIdUser;
    public static javax.swing.JLabel lblLastName;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuBuys;
    private javax.swing.JMenu mnuConfig;
    private javax.swing.JMenu mnuConsultation;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuReport;
    private javax.swing.JMenu mnuSale;
    private javax.swing.JMenu mnuStorage;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
}
