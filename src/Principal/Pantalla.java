package Principal;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import Pantallas.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author baske
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    InicioSesion inicio = new InicioSesion();
    IntroDatos introduccionDatos = new IntroDatos();
    CalDiarias calDiarias = new CalDiarias();
    Ajustes ajustes = new Ajustes();

    public Pantalla() {    

        setTitle("Kcalculadora");
        initComponents();
        setLocationRelativeTo(null);
        verPestaña(inicio);
        try{
        Image icono = ImageIO.read(getClass().getResource("/tools/img/vegetariano.png"));
        setIconImage(icono);
        }catch(Exception e){
            System.out.println("Error con el icono");
        }
  
    }
    public void verPestaña(JPanel pestaña){
        pestaña.setSize(680,640);
        pestaña.setLocation(0,0);
        PantallaPrincipal.removeAll();
        PantallaPrincipal.add(pestaña);
        PantallaPrincipal.revalidate();
        PantallaPrincipal.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        NombreLogo = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        PantallaPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IntroData = new javax.swing.JLabel();
        ObjetivoDiario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        HistorialDiario = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        Ajustes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(990, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(990, 600));

        NombreLogo.setBackground(new java.awt.Color(255, 255, 255));
        NombreLogo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        NombreLogo.setForeground(new java.awt.Color(255, 255, 255));
        NombreLogo.setText("KCALculadora");
        NombreLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NombreLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreLogoMouseClicked(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/img/vegetariano.png"))); // NOI18N
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoMouseClicked(evt);
            }
        });

        PantallaPrincipal.setMaximumSize(new java.awt.Dimension(990, 600));
        PantallaPrincipal.setPreferredSize(new java.awt.Dimension(680, 600));
        PantallaPrincipal.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Las calorias cuentan");

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nosotros las calculamos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        IntroData.setBackground(new java.awt.Color(51, 51, 51));
        IntroData.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        IntroData.setForeground(new java.awt.Color(255, 255, 255));
        IntroData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IntroData.setText("Introducir Datos");
        IntroData.setOpaque(true);
        IntroData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IntroDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IntroDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IntroDataMouseExited(evt);
            }
        });

        ObjetivoDiario.setBackground(new java.awt.Color(51, 51, 51));
        ObjetivoDiario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        ObjetivoDiario.setForeground(new java.awt.Color(255, 255, 255));
        ObjetivoDiario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ObjetivoDiario.setText("Objetivo Diario");
        ObjetivoDiario.setOpaque(true);
        ObjetivoDiario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObjetivoDiarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ObjetivoDiarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ObjetivoDiarioMouseExited(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        HistorialDiario.setBackground(new java.awt.Color(51, 51, 51));
        HistorialDiario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        HistorialDiario.setForeground(new java.awt.Color(255, 255, 255));
        HistorialDiario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HistorialDiario.setText("Historial Diario");
        HistorialDiario.setOpaque(true);
        HistorialDiario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistorialDiarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistorialDiarioMouseExited(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(51, 51, 51));
        Salir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("SALIR");
        Salir.setOpaque(true);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        Ajustes.setBackground(new java.awt.Color(51, 51, 51));
        Ajustes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Ajustes.setForeground(new java.awt.Color(255, 255, 255));
        Ajustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ajustes.setText("AJUSTES");
        Ajustes.setOpaque(true);
        Ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AjustesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Logo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NombreLogo)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(IntroData, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ObjetivoDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HistorialDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(PantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(NombreLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Logo)))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IntroData, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ObjetivoDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HistorialDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addComponent(PantallaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IntroDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IntroDataMouseEntered
        IntroData.setFont(new Font("Roboto",Font.BOLD,20));
    }//GEN-LAST:event_IntroDataMouseEntered

    private void IntroDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IntroDataMouseExited
        IntroData.setFont(new Font("Roboto",Font.PLAIN,18));

    }//GEN-LAST:event_IntroDataMouseExited

    private void ObjetivoDiarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObjetivoDiarioMouseEntered
        ObjetivoDiario.setFont(new Font("Roboto",Font.BOLD,20));
    }//GEN-LAST:event_ObjetivoDiarioMouseEntered

    private void ObjetivoDiarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObjetivoDiarioMouseExited
        ObjetivoDiario.setFont(new Font("Roboto",Font.PLAIN,18));
    }//GEN-LAST:event_ObjetivoDiarioMouseExited

    private void HistorialDiarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialDiarioMouseEntered
       HistorialDiario.setFont(new Font("Roboto",Font.BOLD,20));
    }//GEN-LAST:event_HistorialDiarioMouseEntered

    private void HistorialDiarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialDiarioMouseExited
        HistorialDiario.setFont(new Font("Roboto",Font.PLAIN,18));
    }//GEN-LAST:event_HistorialDiarioMouseExited

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
       Salir.setFont(new Font("Roboto",Font.BOLD,20));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
       Salir.setFont(new Font("Roboto",Font.PLAIN,18));
    }//GEN-LAST:event_SalirMouseExited

    private void AjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesMouseEntered
        Ajustes.setFont(new Font("Roboto",Font.BOLD,20));
    }//GEN-LAST:event_AjustesMouseEntered

    private void AjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesMouseExited
        Ajustes.setFont(new Font("Roboto",Font.PLAIN,18));
    }//GEN-LAST:event_AjustesMouseExited

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void AjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesMouseClicked
        verPestaña(ajustes);
    }//GEN-LAST:event_AjustesMouseClicked

    private void NombreLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreLogoMouseClicked
        verPestaña(inicio);
    }//GEN-LAST:event_NombreLogoMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        verPestaña(inicio);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseClicked
         verPestaña(inicio);
    }//GEN-LAST:event_LogoMouseClicked

    private void IntroDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IntroDataMouseClicked
        verPestaña(introduccionDatos);
    }//GEN-LAST:event_IntroDataMouseClicked

    private void ObjetivoDiarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObjetivoDiarioMouseClicked
        verPestaña(calDiarias);
    }//GEN-LAST:event_ObjetivoDiarioMouseClicked
    

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Pantalla().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ajustes;
    private javax.swing.JLabel HistorialDiario;
    private javax.swing.JLabel IntroData;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreLogo;
    private javax.swing.JLabel ObjetivoDiario;
    private javax.swing.JPanel PantallaPrincipal;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
