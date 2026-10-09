/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import Vista.VistaCiclismo;
/**
 *
 * @author USER
 */
public class ControladorCiclismo {
    private Competidor[] listaCompetidores;
    private int contadorCompetidores;
    private VistaCiclismo vista;
    
    public ControladorCiclismo(VistaCiclismo vista) {
        this.vista = vista;
        this.listaCompetidores = new Competidor[5];
        this.contadorCompetidores = 0;
    }
    public void iniciar(){
       while(true){
           int opcion = vista.menu();
           if(opcion==1){
               registrarCompetidor();
           }
           else if (opcion ==2){
               mostrarCompetidores();
           }
           else if(opcion==3){
               actualizarRankingCompetidor();
           }
           else if (opcion ==4){
               vista.mostrarMensaje("¡Saliendo del sistema de control!");
               break;
           }
           else{
               vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
           }
       }
    }
    public void registrarCompetidor() {
        if (contadorCompetidores >= 5) {
            vista.mostrarMensaje("Límite alcanzado: No se pueden registrar más de 5 competidores.");
            return;
        }

        vista.mostrarMensaje("--- Registro de Competidor ---");
        String nombre = vista.pedirTexto("Nombre del ciclista:");
        int edad = vista.pedirEntero("Edad:");
        String pais = vista.pedirTexto("País:");
        int puntos = vista.pedirEntero("Puntos iniciales:");
        double estatura = vista.pedirDecimal("Estatura (metros):");
        double peso = vista.pedirDecimal("Peso (kg):");
        Competidor nuevo = new Competidor(estatura, peso, puntos, nombre,edad,pais);
        listaCompetidores[contadorCompetidores] = nuevo;
        contadorCompetidores++;
        recalcularRankings();
        vista.mostrarMensaje("¡Competidor registrado exitosamente!");
    }
    public void mostrarCompetidores() {
        if (contadorCompetidores == 0) {
            vista.mostrarMensaje("No hay competidores registrados.");
            return;
        }

        String reporte = "--- LISTA DE COMPETIDORES ---\n\n";
        for (int i = 0; i < contadorCompetidores; i++) {
            reporte += "Índice [" + i + "]:\n" + listaCompetidores[i].toString() + "\n------------------------------------\n";
        }
        
        vista.mostrarMensaje(reporte);
    }
    public void recalcularRankings(){
        for (int i = 0; i < contadorCompetidores; i++) {
            int posicion = 1;
            for (int j = 0; j < contadorCompetidores; j++) {
                if (listaCompetidores[j].getPuntos() > listaCompetidores[i].getPuntos()) {
                    posicion++;
                }
            }
            listaCompetidores[i].setRanking(posicion);
        }
    }
    private void actualizarRankingCompetidor() {
        if (contadorCompetidores == 0) {
            vista.mostrarMensaje("No hay competidores registrados.");
            return;
        }

        mostrarCompetidores();

        int indice = vista.pedirEntero("Seleccione el índice del competidor a actualizar:");
        if (indice >= 0 && indice < contadorCompetidores) {
            Competidor c = listaCompetidores[indice];
            int puntos = vista.pedirEntero("Ingrese los puntos obtenidos en la carrera:");
            boolean ganoMedalla = vista.pedirBooleano("¿Ganó medalla en esta prueba?");

            c.actualizarRanking(puntos, ganoMedalla);
            recalcularRankings(); 
            
            vista.mostrarMensaje("¡Puntos agregados y ranking general recalculado exitosamente!");
        } else {
            vista.mostrarMensaje("Índice no válido.");
        }
    }
}
