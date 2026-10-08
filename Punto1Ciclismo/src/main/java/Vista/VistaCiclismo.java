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
    
}
