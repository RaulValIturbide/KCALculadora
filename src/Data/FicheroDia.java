
package Data;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextField;
/**
 *
 * @author baske
 */
public class FicheroDia {
    static String rutaCarbo = ".\\src\\tools\\etc\\Macronutriente\\Carbohidratos " + sacarDia();
    static String rutaProte = ".\\src\\tools\\etc\\Macronutriente\\Proteinas " + sacarDia();
    static String rutaGrasas = ".\\src\\tools\\etc\\Macronutriente\\Grasas " + sacarDia();


    public static Scanner teclado = new Scanner(System.in);
    
    
    /**
     * Metodo que buscará cual es el dia del sistema
     * @return devolverá un String con el numero del dia separado por "-" con un .txt al final
     */
    public static String sacarDia(){
    LocalDate reloj = LocalDate.now();
    String dia = String.valueOf(reloj.getDayOfMonth());
    String mes = String.valueOf(reloj.getMonthValue());
    String anio = String.valueOf(reloj.getYear());
    String fecha = dia +"-"+ mes +"-"+ anio + ".txt";
    
    return fecha;
    }
    
    /**
     * El objetivo de este metodo es que borre todos los datos del dia de hoy ya
     * que aún no he encontrado una manera de borrar de alimento en alimento
     *
     * @param ruta La ruta de acceso al txt que se machacará dejandolo en blanco
     */
    public static void borrarDataDia(String ruta) {

        try {
            FileWriter escritor = new FileWriter(ruta);
            escritor.write("0");
            escritor.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra la ruta de acceso al txt para borrar el dia de hoy");
        } catch (IOException e) {
            System.out.println("Error fatal con el escritor de borrarDataDia");
        }
    }

    /**
     * Este metodo calcula la cantidad de calorias a trav�s de un calculo matem�tico b�sico
     * @param gramos la cantidad de gramos que el usuario ha consumido del alimento
     * @param calorias la cantidad de calorias que hay en 100 gramos del alimento (info nutricional)
     * @return devuelve el valor en tipo String
     */
    public static String calculoCalorico(String gramos, String calorias) {
        
        gramos = gramos.trim(); //Eliminamos los saltos de linea
        calorias = calorias.trim(); // Eliminamos los saltos de linea
        
        if (gramos.equals("") || calorias.equals("")) {
            System.out.println("No hay datos en la comida");
            return "";
        } else {
            double caloriaNum = Double.parseDouble(calorias);
            double gramosNum = Double.parseDouble(gramos);

            double resultado = (gramosNum / 100) * caloriaNum;
            String resultadoFormateado = String.format("%.2f", resultado) + "\n";
            return resultadoFormateado;
        }
    }
    
    public static void escribirMacros(JTextField carbo,JTextField proteinas,JTextField grasas) {   
        escribirCarbo(carbo);
        escribirProteinas(proteinas);
        escribirGrasas(grasas);    
    }
    
    /**
     * Metodo para crear el txt de carbohidratos o para añadir nuevos numeros
     * @param carbo el campo de texto del que sacaremos los carbohidratos
     */
    private static void escribirCarbo(JTextField carbo) {
        if (Macronutrientes.comprobarCarbohidratos(carbo)) {
            try {
                FileWriter escritor = new FileWriter(rutaCarbo,true);
                escritor.write(carbo.getText() + "\n");
                escritor.close();
                carbo.setText("");

            } catch (FileNotFoundException ex) {
                System.out.println("Error de ruta en los carbohidratos");
            } catch (IOException e) {
                System.out.println("Error fatal en el escritor de ruta de carbohidratos");
            }

        } else {
            System.out.println("Carbohidratos no concuerdan con la expReg, no se imprime");
        }
    }
    
    /**
     * Metodo para crear el txt de proteinas o para añadir nuevos datos
     * @param proteinas el campo de texto del que sacaremos las proteinas
     */
    private static void escribirProteinas(JTextField proteinas) {
        if (Macronutrientes.comprobarProteinas(proteinas)) {
            try {
                FileWriter escritor = new FileWriter(rutaProte, true);
                escritor.write(proteinas.getText() + "\n");
                escritor.close();
                proteinas.setText("");

            } catch (FileNotFoundException ex) {
                System.out.println("Error de ruta en las proteinas");
            } catch (IOException e) {
                System.out.println("Error fatal en el escritor de ruta de proteinas");
            }

        } else {
            System.out.println("Proteinas no concuerdan con la expReg, no se imprime");
        }

    }
    /**
     * Metodo para crear el txt de proteinas o para añadir nuevos datos
     *
     * @param proteinas el campo de texto del que sacaremos las proteinas
     */
    private static void escribirGrasas(JTextField grasas) {
        if (Macronutrientes.comprobarGrasas(grasas)) {
            try {
                FileWriter escritor = new FileWriter(rutaGrasas, true);
                escritor.write(grasas.getText() + "\n");
                escritor.close();
                grasas.setText("");

            } catch (FileNotFoundException ex) {
                System.out.println("Error de ruta en las grasas");
            } catch (IOException e) {
                System.out.println("Error fatal en el escritor de ruta de grasas");
            }

        } else {
            System.out.println("Grasas no concuerdan con la expReg, no se imprime");
        }

    }

    
}
