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
   public String pedirTexto(String mensaje) {
        return JOptionPane.showInputDialog(mensaje, "Entrada de Datos");
    }

    public int pedirEntero(String mensaje) {
        String entrada = JOptionPane.showInputDialog(mensaje, "Entrada de Datos");
        return Integer.parseInt(entrada);
    }

    public double pedirDecimal(String mensaje) {
        String entrada = JOptionPane.showInputDialog(mensaje, "Entrada de Datos");
        return Double.parseDouble(entrada);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public boolean pedirBooleano(String mensaje){
        boolean medalla;
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(mensaje, "si(1), no(2)"));
        if (entrada==1){
            medalla = true;
            return medalla;
        }
        else{
            medalla = false;
            return medalla;
        }
    }
}
