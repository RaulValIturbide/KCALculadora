/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pantallas;

import java.io.FileNotFoundException;
import Data.FicheroCalData;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;

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
        double resultado;
        if (obj.matches(regExp)) {
            double num1 = Double.parseDouble(totalCal);
            double num2 = Double.parseDouble(obj);

            resultado = num2 - num1;
        } else {
            resultado = -1;
        }
        return resultado;
    }
    private void cambiaColoresCalRestantes(JLabel campo, String objCal, String calActualidad) {

        if (!objCal.equals("") && !calActualidad.equals("")) {
            double numObjCal = Double.parseDouble(objCal);//Pasamos el texto a double para poder trabajar con el
            double numCalAct = Double.parseDouble(calActualidad);
            double primPorcentaje = numObjCal / 4; // El 25% del objetivo
            double segPorcentaje = numObjCal / 2; //El 50% del objetivo
            double tercPorcentaje = numObjCal / 1.33; //El 75% del objetivo

            if (numCalAct <= primPorcentaje) {
                campo.setBackground(Color.GREEN);
            } else if (numCalAct <= segPorcentaje) {
                campo.setBackground(Color.YELLOW);
            } else if (numCalAct <= tercPorcentaje) {
                campo.setBackground(Color.ORANGE);
            } else {
                campo.setBackground(Color.RED);
            }

        }else{
            System.out.println("Error con el cambio de colores");
        }

    }
    
    public String sacarObj(){
        String rutaObj = "src/tools/etc/ObjetivoDiario/ObjetivoCal.txt";
        File archivo = new File(rutaObj);
        String Parrafo = "";
        if (archivo.exists()) {
            try {
                FileReader lector = new FileReader(rutaObj);
                int data = lector.read();

                while (data != -1) {
                    Parrafo += (char) data;
                    data = lector.read();
                }
            } catch (FileNotFoundException ex) {
                System.out.println("No se encuentra el archivo de objCal");
            } catch (IOException e) {
                System.out.println("Error fatal con el lecto de objetivo calorico");
            }
        } else {
            System.out.println("el archivo no existe");
            return "0";
        }
        System.out.println("Texto sacado del objetivo: " + Parrafo);
        return Parrafo;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Texto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Objetivo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TxtActualizar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        JLCarbohidratos = new javax.swing.JLabel();
        JLGrasas = new javax.swing.JLabel();
        JLProteinas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(680, 600));

        Texto.setBackground(new java.awt.Color(255, 255, 255));
        Texto.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL DE CALORIAS HOY");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CALORIAS RESTANTES HOY");

        Objetivo.setBackground(new java.awt.Color(255, 102, 102));
        Objetivo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        Objetivo.setForeground(new java.awt.Color(0, 0, 0));
        Objetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Objetivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Objetivo.setOpaque(true);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        TxtActualizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        TxtActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtActualizar.setText("ACTUALIZAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TxtActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        JLCarbohidratos.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        JLCarbohidratos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLCarbohidratos.setText("CARBOHIDRATOS");

        JLGrasas.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        JLGrasas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLGrasas.setText("GRASAS");

        JLProteinas.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        JLProteinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLProteinas.setText("PROTEINAS");

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setText("PLACEHOLDER GRAFICO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JLCarbohidratos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLGrasas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLProteinas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLCarbohidratos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLProteinas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(JLGrasas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setText("ESTADISTICAS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools/img/presentacion.png"))); // NOI18N

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addComponent(Objetivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(Objetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if (FicheroCalData.totalCalorias().equalsIgnoreCase("no data")) {
            Texto.setFont(new Font("Roboto", Font.PLAIN, 14));
            Texto.setText("Introduzca un alimento primero");
        } else {
            Texto.setFont(new Font("Roboto", Font.PLAIN, 36));
            Texto.setText(FicheroCalData.totalCalorias());
        }

        if (calcularObj(FicheroCalData.totalCalorias(), leerObjCal()) == -1) {
            Objetivo.setFont(new Font("Roboto", Font.PLAIN, 14));
            Objetivo.setText("Cree un objetivo en ajustes");
        } else {
            double obj = calcularObj(FicheroCalData.totalCalorias(), leerObjCal());
            Objetivo.setFont(new Font("Roboto", Font.PLAIN, 36));
            Objetivo.setText(String.valueOf(obj));
        }
        
        cambiaColoresCalRestantes(Objetivo,sacarObj(),Texto.getText());
        
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        TxtActualizar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        TxtActualizar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jPanel1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel JLCarbohidratos;
    private javax.swing.JLabel JLGrasas;
    private javax.swing.JLabel JLProteinas;
    private javax.swing.JLabel Objetivo;
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel TxtActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
