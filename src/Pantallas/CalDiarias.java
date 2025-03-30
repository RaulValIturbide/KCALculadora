/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pantallas;

import Data.FicheroDia;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import Data.FicheroCalData;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author baske
 */
public class CalDiarias extends javax.swing.JPanel {

    /**
     * Creates new form CalDiarias
     */
    public CalDiarias() {
        initComponents();
       
    }
    
    public String leerObjCal() {
        String resultado = "";
        try {
            FileReader lector = new FileReader(".\\src\\tools\\etc\\ObjetivoDiario\\ObjetivoCal.txt");
            int data = lector.read();
            
            while (data != -1) {
                resultado += (char) data;

                data = lector.read();
            }
            System.out.println(resultado);

        } catch (FileNotFoundException ex) {
            System.out.println("Ruta de lector objetivo calorico no encontrada");
        } catch (IOException e) {
            System.out.println("Fallo en el lector de objetivo calorico");
        }
        return resultado;
    }
    public double calcularObj(String totalCal, String obj) {

        String regExp = "^(\\d{1,}$)|(^\\d{1,}(,|\\.)\\d{1,}$)";
        double resultado = 0;
        if (obj.matches(regExp)) {
            double num1 = Double.parseDouble(totalCal);
            double num2 = Double.parseDouble(obj);

            resultado = num2 - num1;
        } else {
            resultado = -1;
        }
        return resultado;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Texto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Objetivo = new javax.swing.JLabel();

        Fondo.setBackground(new java.awt.Color(0, 153, 153));
        Fondo.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N

        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Texto.setBackground(new java.awt.Color(255, 102, 102));
        Texto.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL DE CALORIAS HOY");

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CALORIAS RESTANTES HOY");

        Objetivo.setBackground(new java.awt.Color(255, 102, 102));
        Objetivo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Objetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Objetivo.setOpaque(true);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Objetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Objetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Texto.setText(FicheroCalData.totalCalorias());
        
        if (calcularObj(FicheroCalData.totalCalorias(), leerObjCal()) == -1) {
            Objetivo.setFont(new Font("Roboto",Font.PLAIN,28));
            Objetivo.setText("Cree un objetivo en ajustes");
        } else {
            double obj = calcularObj(FicheroCalData.totalCalorias(), leerObjCal());
            Objetivo.setFont(new Font("Roboto",Font.PLAIN,36));
            Objetivo.setText(String.valueOf(obj));
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Objetivo;
    private javax.swing.JLabel Texto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
