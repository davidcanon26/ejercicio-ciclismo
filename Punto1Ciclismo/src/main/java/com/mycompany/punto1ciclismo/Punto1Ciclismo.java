/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto1ciclismo;
import Controlador.ControladorCiclismo;
import Vista.VistaCiclismo;
/**
 *
 * @author Usuario
 */
public class Punto1Ciclismo {

    public static void main(String[] args) {
        VistaCiclismo vista = new VistaCiclismo();
        ControladorCiclismo controlador = new ControladorCiclismo(vista);
        controlador.iniciar();
    }
}
