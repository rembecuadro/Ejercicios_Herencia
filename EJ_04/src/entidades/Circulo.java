/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import interfaz.calculosFormas;

/**
 *
 * @author Usuario
 */
public class Circulo implements calculosFormas{
    public double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
       return pi * radio * radio;
    }

    @Override
    public double perimetro() {
       return pi * (radio*2);
    }
    
   
    
}
