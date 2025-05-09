/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pantallas;

import Data.FicheroDia;
import java.awt.Color;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author baske
 */
public class IntroDatos extends javax.swing.JPanel {

    /**
     * Creates new form IntroDatos
     */
    private boolean infoMacros = false;
    public IntroDatos() {
        initComponents();
        InfoMacros.setVisible(false);
        AdCampos.setVisible(false);
        AlimentoAdd.setVisible(false);
    }
    public void generarCalTotal(){
        try{
        FileWriter escritor = new FileWriter("..\\src\\tools\\etc\\CalDia\\" +"CalTot " + FicheroDia.sacarDia(), true);
        escritor.write(FicheroDia.calculoCalorico(TxtPeso.getText(),TxtCalorias.getText()));
        escritor.close();
        }catch(FileNotFoundException ex){
            System.out.println("Ruta no encontrada en el fichero de calorias totales");
        }catch(IOException e){
            System.out.println("Fallo fatal con el escritor de caltotales");
        }
    }
    
    /**
     * Este metodo genera un txt en la ruta seleccionada para mantener el control del nombre,peso y calorias que ha consumido el usuario
     */
    public void generarAlimentoBasico() {
        if(comprobarDatos()){
        try {
            FileWriter escritor = new FileWriter("..\\src\\tools\\etc\\Dias\\" +"Dia " + FicheroDia.sacarDia(), true);
            escritor.write(TxtAlimento.getText() + "\n");
            escritor.write(TxtPeso.getText() + "\n");
            escritor.write(TxtCalorias.getText() + "\n");
            escritor.close();
            generarCalTotal();
            AlimentoAdd.setVisible(true);
            borrarCamposBasicos();
            AdCampos.setVisible(false);
        } catch (FileNotFoundException ex) {
            System.out.println("Ruta de archivo no encontrada");
        } catch (IOException e) {
            System.out.println("Fallo en el escritor de archivo Dias");
        }
        }else{
            AdCampos.setVisible(true);
            System.out.println("Valores no numericos");
        }
    }
    public void borrarCamposBasicos(){
            TxtAlimento.setText("");
            TxtPeso.setText("");
            TxtCalorias.setText("");
    }
    
    /**
     * Este metodo se asegura de que lo introducido en los campos Peso y
     * calorias sea un numero con o sin decimales
     *
     * @return true si es un numero, false si no lo es
     */
    public boolean comprobarDatos() {
        String expReg = "(^\\d{1,}$)|(^\\d{1,}(,|.)\\d{1,}$)";
        if (TxtCalorias.getText().matches(expReg) && TxtPeso.getText().matches(expReg)) {
            System.out.println("Expresion regular correcta");
            return true;
        } else {
            return false;
        }

    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lienzo = new javax.swing.JPanel();
        TitIntroducir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        TxtCalorias = new javax.swing.JTextField();
        TxtAlimento = new javax.swing.JTextField();
        TxtPeso = new javax.swing.JTextField();
        InfoMacros = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Añadir = new javax.swing.JLabel();
        AlimentoAdd = new javax.swing.JLabel();
        AdCampos = new javax.swing.JLabel();

        Lienzo.setBackground(new java.awt.Color(255, 255, 255));
        Lienzo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitIntroducir.setFont(new java.awt.Font("Roboto", 1, 32)); // NOI18N
        TitIntroducir.setText("INTRODUCIR DATOS");
        Lienzo.add(TitIntroducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 350, 80));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("NOMBRE ALIMENTO");
        Lienzo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 220, 50));
        Lienzo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 280, 20));
        Lienzo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 280, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("PESO (GR)");
        Lienzo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 160, 50));
        Lienzo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 280, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("CALORIAS EN 100 GR");
        Lienzo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 230, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("MACRONUTRIENTES");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/img/preguntas.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel5.setText("CARBOHIDRATOS");

        jTextField4.setBackground(new java.awt.Color(214, 217, 223));
        jTextField4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("PROTEINAS");

        jTextField5.setBackground(new java.awt.Color(214, 217, 223));
        jTextField5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("GRASAS");

        jTextField6.setBackground(new java.awt.Color(214, 217, 223));
        jTextField6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4)
                        .addGap(15, 15, 15)))
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Lienzo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 310, 180));

        TxtCalorias.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TxtCalorias.setBorder(null);
        TxtCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCaloriasActionPerformed(evt);
            }
        });
        Lienzo.add(TxtCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 280, -1));

        TxtAlimento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TxtAlimento.setBorder(null);
        TxtAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAlimentoActionPerformed(evt);
            }
        });
        Lienzo.add(TxtAlimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 280, -1));

        TxtPeso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TxtPeso.setBorder(null);
        TxtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPesoActionPerformed(evt);
            }
        });
        Lienzo.add(TxtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 280, -1));

        InfoMacros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("¿QUÉ SON?");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/img/vegetariano2.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel7.setText("Los macronutrientes componen la mayoria");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel9.setText("de los alimentos");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel10.setText("Puedes encontrarlos en la info nutricional");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel11.setText("de cada alimento pero no te preocupes");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel12.setText("puedes dejarlo en blanco si no te interesa");

        javax.swing.GroupLayout InfoMacrosLayout = new javax.swing.GroupLayout(InfoMacros);
        InfoMacros.setLayout(InfoMacrosLayout);
        InfoMacrosLayout.setHorizontalGroup(
            InfoMacrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoMacrosLayout.createSequentialGroup()
                .addGroup(InfoMacrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoMacrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InfoMacrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addGroup(InfoMacrosLayout.createSequentialGroup()
                                .addGroup(InfoMacrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))))
                    .addGroup(InfoMacrosLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InfoMacrosLayout.setVerticalGroup(
            InfoMacrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoMacrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoMacrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoMacrosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(InfoMacrosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(16, 16, 16))
        );

        Lienzo.add(InfoMacros, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 300, 170));

        Añadir.setBackground(new java.awt.Color(214, 217, 223));
        Añadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Añadir.setText("AÑADIR");
        Añadir.setOpaque(true);
        Añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AñadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AñadirMouseExited(evt);
            }
        });
        Lienzo.add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 90, 40));

        AlimentoAdd.setBackground(new java.awt.Color(214, 217, 223));
        AlimentoAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlimentoAdd.setText("ALIMENTO AÑADIDO");
        AlimentoAdd.setOpaque(true);
        AlimentoAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlimentoAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlimentoAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlimentoAddMouseExited(evt);
            }
        });
        Lienzo.add(AlimentoAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 150, 40));

        AdCampos.setBackground(new java.awt.Color(214, 217, 223));
        AdCampos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdCampos.setText("RELLENA LOS CAMPOS");
        AdCampos.setOpaque(true);
        AdCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdCamposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdCamposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdCamposMouseExited(evt);
            }
        });
        Lienzo.add(AdCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCaloriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCaloriasActionPerformed

    private void TxtAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAlimentoActionPerformed

    private void TxtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPesoActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(!infoMacros){
            InfoMacros.setVisible(true);
            infoMacros = true;
        }else{
            InfoMacros.setVisible(false);
            infoMacros = false;
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void AñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirMouseEntered
       Añadir.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AñadirMouseEntered

    private void AñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirMouseExited
        Añadir.setForeground(new Color(0, 0 , 0));
    }//GEN-LAST:event_AñadirMouseExited

    private void AñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirMouseClicked
        AlimentoAdd.setVisible(false);
        AdCampos.setVisible(false);
        comprobarDatos();
        generarAlimentoBasico();
    }//GEN-LAST:event_AñadirMouseClicked

    private void AlimentoAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlimentoAddMouseClicked
        AlimentoAdd.setVisible(false);
    }//GEN-LAST:event_AlimentoAddMouseClicked

    private void AlimentoAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlimentoAddMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AlimentoAddMouseEntered

    private void AlimentoAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlimentoAddMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AlimentoAddMouseExited

    private void AdCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdCamposMouseClicked
         AdCampos.setVisible(false);
    }//GEN-LAST:event_AdCamposMouseClicked

    private void AdCamposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdCamposMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AdCamposMouseEntered

    private void AdCamposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdCamposMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AdCamposMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdCampos;
    private javax.swing.JLabel AlimentoAdd;
    private javax.swing.JLabel Añadir;
    private javax.swing.JPanel InfoMacros;
    private javax.swing.JPanel Lienzo;
    private javax.swing.JLabel TitIntroducir;
    private javax.swing.JTextField TxtAlimento;
    private javax.swing.JTextField TxtCalorias;
    private javax.swing.JTextField TxtPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
