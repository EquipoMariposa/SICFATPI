package vistas;

import controlador.controlMenuPrincipal;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

public class VistaMenuPrincipal extends javax.swing.JFrame {

	javax.swing.ImageIcon fondo;
    
    private class MyJDesktopPane extends javax.swing.JDesktopPane {
        @Override
        protected void paintComponent(java.awt.Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }

    controlMenuPrincipal controlador=new controlMenuPrincipal(this);
    
    public JDesktopPane getEscritorioMenuPrincipal() {
        return escritorioMenuPrincipal;
    }

    public void setEscritorioMenuPrincipal(JDesktopPane escritorioMenuPrincipal) {
        this.escritorioMenuPrincipal = escritorioMenuPrincipal;
    }

    public JMenuItem getItemListines() {
        return itemListines;
    }

    public void setItemListines(JMenuItem itemListines) {
        this.itemListines = itemListines;
    }

    public JMenuItem getItemSalirSistema() {
        return itemSalirSistema;
    }

    public void setItemSalirSistema(JMenuItem itemSalirSistema) {
        this.itemSalirSistema = itemSalirSistema;
    }

    public VistaMenuPrincipal() {
    	fondo = new javax.swing.ImageIcon(getClass().getResource("/src/fondo.jpg"));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorioMenuPrincipal = new MyJDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemListines = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        itemHabilitaciones = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemSalirSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioMenuPrincipalLayout = new javax.swing.GroupLayout(escritorioMenuPrincipal);
        escritorioMenuPrincipal.setLayout(escritorioMenuPrincipalLayout);
        escritorioMenuPrincipalLayout.setHorizontalGroup(
            escritorioMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        escritorioMenuPrincipalLayout.setVerticalGroup(
            escritorioMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(158, 158, 158));

        jMenu1.setText("Archivo");

        itemListines.setText("Listines");
        itemListines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListinesActionPerformed(evt);
            }
        });
        jMenu1.add(itemListines);
        itemListines.addActionListener(controlador);

        jMenuItem1.setText("Tasa de Salida");
        jMenu1.add(jMenuItem1);

        itemHabilitaciones.setText("Habilitaciones");
        jMenu1.add(itemHabilitaciones);
        itemHabilitaciones.addActionListener(controlador);

        jMenuItem3.setText("Pista de Toque");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Reportes");

        jMenuItem10.setText("Generar Reportes");
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configuracion");

        jMenuItem4.setText("Lineas de Transporte");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Montos");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Locales");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Conductores");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Unidades de Transporte");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Vendedores Ambulantes");
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Salir");

        itemSalirSistema.setText("Salir Sistema");
        jMenu2.add(itemSalirSistema);
        itemSalirSistema.addActionListener(controlador);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioMenuPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorioMenuPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemListinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemListinesActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VistaMenuPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorioMenuPrincipal;
    private javax.swing.JMenuItem itemHabilitaciones;
    private javax.swing.JMenuItem itemListines;
    private javax.swing.JMenuItem itemSalirSistema;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
