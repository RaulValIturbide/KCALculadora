/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import javax.swing.JLabel;
import java.util.InputMismatchException;
import Exception.IncorrectaExpRegularException;
import javax.swing.JTextField;

/**
 *
 * @author raulz
 */
public class Macronutrientes {

    /*
        Se considera que una dieta equilibrada debe estar compuesta por:
        -Un 45% a 65% de hidratos
        -Un 20% a 35% de grasas
        -Un 10% a 35% de proteinas
     */
    static String expReg = "(^\\d{1,}$)|(^\\d{1,}(,|.)\\d{1,}$)";
    private static String proteinas;
    private static String carbohidratos;
    private static String grasas;

    public Macronutrientes() {
    }
    
    
/**
 * Comprobamos si en el texto se han introducido unos datos acorde con la expReg, es decir, numeros con o sin decimales
 * @param Txtproteinas el Jlabel del que cogerá la informacion del usuario a la variable
 * @return  true si pasa la prueba de la expReg false si no
 */
    public static boolean comprobarProteinas(JTextField Txtproteinas) {
        boolean correcto = false;
        try {
            if (Txtproteinas.getText().matches(expReg)) {
                proteinas = Txtproteinas.getText();
                correcto = true;
            } else {
                throw new IncorrectaExpRegularException("Los datos introducidos no coinciden con la expReg");
            }
        } catch (IncorrectaExpRegularException p) {
            System.out.println("Error: " + p.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato incorrecto en proteinas");
        } catch (Exception ex) {
            System.out.println("Error fatals con la comprobacion de proteinas");
        }
        return correcto;
    }
    
     /**
     * Comprobamos si en el texto se han introducido unos datos acorde con la expReg, es decir, numeros con o sin decimales
     * @param TxtCarbohidratos Jlabel del que cogerá la informacion del usuario a la variable
     * @return true si pasa la prueba de la expReg false si no
     */
    public static boolean comprobarCarbohidratos(JTextField TxtCarbohidratos) {
        boolean correcto = false;
        try {
            if (TxtCarbohidratos.getText().matches(expReg)) {
                carbohidratos = TxtCarbohidratos.getText();
                correcto = true;
            } else {
                throw new IncorrectaExpRegularException("Los datos introducidos no coinciden con la expReg");
            }
        } catch (IncorrectaExpRegularException p) {
            System.out.println("Error: " + p.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato incorrecto en carbohidratos");
        } catch (Exception ex) {
            System.out.println("Error fatal con la comprobacion de carbohidratos");
        }
        return correcto;
    }

    /**
     * Comprobamos si en el texto se han introducido unos datos acorde con la expReg, es decir, numeros con o sin decimales
     * @param TxtGrasas Jlabel del que cogerá la informacion del usuario a la variable
     * @return true si pasa la prueba de la expReg false si no
     */
    public static boolean comprobarGrasas(JTextField TxtGrasas) {
        boolean correcto = false;
        try {
            if (TxtGrasas.getText().matches(expReg)) {
                grasas = TxtGrasas.getText();
                correcto = true;
            } else {
                throw new IncorrectaExpRegularException("Los datos introducidos no coinciden con la expReg");
            }
        } catch (IncorrectaExpRegularException p) {
            System.out.println("Error: " + p.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato incorrecto en grasas");
        } catch (Exception ex) {
            System.out.println("Error fatals con la comprobacion de grasas");
        }
        return correcto;
    }
    
    
    
    
    
    
    

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }

    public String getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(String carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public String getGrasas() {
        return grasas;
    }

    public void setGrasas(String grasas) {
        this.grasas = grasas;
    }

}
