/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandojanelas;

import java.awt.Desktop;
import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;

/**
 *
 * @author Fabinhu
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
        /*abre a tela maximizada
        this.setExtendedState(MAXIMIZED_BOTH);
        */
        
    }

     public void chamarTela(){
    JFrame telaPrincipal = new JFrame();
    JDesktopPane DeskPane = new JDesktopPane();
    JInternalFrame telaSecundaria = new JInternalFrame();
    
    telaPrincipal.add(DeskPane);
    
        
        telaSecundaria.setClosable(true);
        telaSecundaria.setIconifiable(true); 
        telaSecundaria.setResizable(true); //minimizar tela
        DeskPane.add(telaSecundaria);
        
        //Torna seu painel Visivel interno
        telaSecundaria.setSize(100,100);
        telaSecundaria.setVisible(true);
        
        telaPrincipal.setSize(400,400);
        telaPrincipal.setVisible(true);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovaJanela = new javax.swing.JButton();
        jdpAreaTelas = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNovaJanela.setText("Abrir Janela");
        btnNovaJanela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaJanelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdpAreaTelasLayout = new javax.swing.GroupLayout(jdpAreaTelas);
        jdpAreaTelas.setLayout(jdpAreaTelasLayout);
        jdpAreaTelasLayout.setHorizontalGroup(
            jdpAreaTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jdpAreaTelasLayout.setVerticalGroup(
            jdpAreaTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovaJanela)
                .addContainerGap(582, Short.MAX_VALUE))
            .addComponent(jdpAreaTelas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovaJanela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdpAreaTelas))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnNovaJanelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaJanelaActionPerformed
chamarTela();    
    }//GEN-LAST:event_btnNovaJanelaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovaJanela;
    private javax.swing.JDesktopPane jdpAreaTelas;
    // End of variables declaration//GEN-END:variables
}
