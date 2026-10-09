/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class VistaCiclismo {
    public int menu(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Bienvenido al menú del mundial de ciclismo de pista\n"
                + "1.Registrar competidor\n"
                + "2.Mostrar todos los competidores\n"
                + "3.Actualizar ranking de competidor\n"
                + "4.Salir\n"
                + "Por favor seleccione una opcion"));
        return opcion;
    }
    public void registrarCompetidor(){
        String nombre = JOptionPane.showInputDialog("Nombre del competidor: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del competidor: "));
        String pais = JOptionPane.showInputDialog("Pais del competidor: ");
        double estatura = Double.parseDouble(JOptionPane.showInputDialog("Estatura del competidor: "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso del competidor: "));
        double puntos = Double.parseDouble(JOptionPane.showInputDialog("Puntos iniciales del competidor: "));
    }
    
}
