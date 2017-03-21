package vistas;

import controlador.ControlMenuPrincipal;
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

    ControlMenuPrincipal controlador=new ControlMenuPrincipal(this);

    public JMenuItem getItemChofer() {
        return itemChofer;
    }

    public void setItemChofer(JMenuItem itemChofer) {
        this.itemChofer = itemChofer;
    }

    public JMenuItem getItemLineaTransporte() {
        return itemLineaTransporte;
    }

    public void setItemLineaTransporte(JMenuItem itemLineaTransporte) {
        this.itemLineaTransporte = itemLineaTransporte;
    }

    public JMenuItem getItemLocal() {
        return itemLocal;
    }

    public void setItemLocal(JMenuItem itemLocal) {
        this.itemLocal = itemLocal;
    }

    public JMenuItem getItemMarca() {
        return itemMarca;
    }

    public void setItemMarca(JMenuItem itemMarca) {
        this.itemMarca = itemMarca;
    }

    public JMenuItem getItemModelo() {
        return itemModelo;
    }

    public void setItemModelo(JMenuItem itemModelo) {
        this.itemModelo = itemModelo;
    }

    public JMenuItem getItemMonto() {
        return itemMonto;
    }

    public void setItemMonto(JMenuItem itemMonto) {
        this.itemMonto = itemMonto;
    }

    public JMenuItem getItemUnidadTransporte() {
        return itemUnidadTransporte;
    }

    public void setItemUnidadTransporte(JMenuItem itemUnidadTransporte) {
        this.itemUnidadTransporte = itemUnidadTransporte;
    }

    public JMenuItem getItemUsuario() {
        return itemUsuario;
    }

    public void setItemUsuario(JMenuItem itemUsuario) {
        this.itemUsuario = itemUsuario;
    }

    public JMenuItem getItemVendedorAmbulante() {
        return itemVendedorAmbulante;
    }

    public void setItemVendedorAmbulante(JMenuItem itemVendedorAmbulante) {
        this.itemVendedorAmbulante = itemVendedorAmbulante;
    }
    
    public JDesktopPane getEscritorioMenuPrincipal() {
        return escritorioMenuPrincipal;
    }

    public void setEscritorioMenuPrincipal(JDesktopPane escritorioMenuPrincipal) {
        this.escritorioMenuPrincipal = escritorioMenuPrincipal;
    }

    public JMenuItem getItemHabilitacion() {
        return itemHabilitacion;
    }

    public void setItemHabilitacion(JMenuItem itemHabilitacion) {
        this.itemHabilitacion = itemHabilitacion;
    }

    public JMenuItem getItemPistaToque() {
        return itemPistaToque;
    }

    public void setItemPistaToque(JMenuItem itemPistaToque) {
        this.itemPistaToque = itemPistaToque;
    }

    public JMenuItem getItemTasaSalida() {
        return itemTasaSalida;
    }

    public void setItemTasaSalida(JMenuItem itemTasaSalida) {
        this.itemTasaSalida = itemTasaSalida;
    }

    
    
    public JMenuItem getItemListin() {
        return itemListin;
    }

    public void setItemListin(JMenuItem itemListin) {
        this.itemListin = itemListin;
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

        escritorioMenuPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemListin = new javax.swing.JMenuItem();
        itemTasaSalida = new javax.swing.JMenuItem();
        itemHabilitacion = new javax.swing.JMenuItem();
        itemPistaToque = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemLineaTransporte = new javax.swing.JMenuItem();
        itemUnidadTransporte = new javax.swing.JMenuItem();
        itemVendedorAmbulante = new javax.swing.JMenuItem();
        itemLocal = new javax.swing.JMenuItem();
        itemChofer = new javax.swing.JMenuItem();
        itemUsuario = new javax.swing.JMenuItem();
        itemMonto = new javax.swing.JMenuItem();
        itemMarca = new javax.swing.JMenuItem();
        itemModelo = new javax.swing.JMenuItem();
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

        itemListin.setText("Listin");
        itemListin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListinActionPerformed(evt);
            }
        });
        jMenu1.add(itemListin);
        itemListin.addActionListener(controlador);

        itemTasaSalida.setText("Tasa de Salida");
        jMenu1.add(itemTasaSalida);
        itemTasaSalida.addActionListener(controlador);

        itemHabilitacion.setText("Habilitacion");
        jMenu1.add(itemHabilitacion);
        itemHabilitacion.addActionListener(controlador);

        itemPistaToque.setText("Pista de Toque");
        jMenu1.add(itemPistaToque);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Reportes");

        jMenuItem10.setText("Generar Reportes");
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configuracion");

        itemLineaTransporte.setText("Linea de Transporte");
        jMenu4.add(itemLineaTransporte);
        itemLineaTransporte.addActionListener(controlador);

        itemUnidadTransporte.setText("Unidad de Transporte");
        jMenu4.add(itemUnidadTransporte);
        itemUnidadTransporte.addActionListener(controlador);

        itemVendedorAmbulante.setText("Vendedor Ambulante");
        jMenu4.add(itemVendedorAmbulante);
        itemVendedorAmbulante.addActionListener(controlador);

        itemLocal.setText("Local");
        jMenu4.add(itemLocal);
        itemLocal.addActionListener(controlador);

        itemChofer.setText("Chofer");
        jMenu4.add(itemChofer);
        itemChofer.addActionListener(controlador);

        itemUsuario.setText("Usuario");
        jMenu4.add(itemUsuario);
        itemUsuario.addActionListener(controlador);

        itemMonto.setText("Monto");
        jMenu4.add(itemMonto);
        itemMonto.addActionListener(controlador);

        itemMarca.setText("Marca");
        jMenu4.add(itemMarca);
        itemMarca.addActionListener(controlador);

        itemModelo.setText("Modelo");
        jMenu4.add(itemModelo);
        itemModelo.addActionListener(controlador);

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

    private void itemListinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemListinActionPerformed

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
    private javax.swing.JMenuItem itemChofer;
    private javax.swing.JMenuItem itemHabilitacion;
    private javax.swing.JMenuItem itemLineaTransporte;
    private javax.swing.JMenuItem itemListin;
    private javax.swing.JMenuItem itemLocal;
    private javax.swing.JMenuItem itemMarca;
    private javax.swing.JMenuItem itemModelo;
    private javax.swing.JMenuItem itemMonto;
    private javax.swing.JMenuItem itemPistaToque;
    private javax.swing.JMenuItem itemSalirSistema;
    private javax.swing.JMenuItem itemTasaSalida;
    private javax.swing.JMenuItem itemUnidadTransporte;
    private javax.swing.JMenuItem itemUsuario;
    private javax.swing.JMenuItem itemVendedorAmbulante;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    // End of variables declaration//GEN-END:variables
}
