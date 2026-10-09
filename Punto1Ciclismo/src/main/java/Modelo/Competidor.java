/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author Usuario
 */
public class Competidor extends Atleta{
    private int ranking;
    private double estatura;
    private double peso;
    private double puntos;

    public Competidor(int ranking, double estatura, double peso,double puntos, String nombre, int edad, String pais) {
        super(nombre, edad, pais);
        this.ranking = ranking;
        this.estatura = estatura;
        this.peso = peso;
        this.puntos = puntos;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "\n"+
                "Ranking:" + ranking + "\n"+
                "Estatura:"+ estatura + "\n"+
                "Peso"+ peso;
    }
    
    
}
