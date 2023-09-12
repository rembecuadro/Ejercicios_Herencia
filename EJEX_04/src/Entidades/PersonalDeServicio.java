/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author merce
 */
public class PersonalDeServicio extends Empleado {

    private String seccion;

    public PersonalDeServicio() {
        crearPersonalDeServicio();
    }

    public PersonalDeServicio(int anioDeIncorporacion, String despacho, String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(anioDeIncorporacion, despacho, nombre, apellido, DNI, estadoCivil);
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    private void crearPersonalDeServicio() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la seccion (string): ");
        this.seccion = leer.next();
    }

    @Override
    public void reasignarDespacho() {
        super.reasignarDespacho();
    }

    public void trasladoSeccion() {
        System.out.print("Digite la nueva seccion del trabajador: ");
        this.seccion = leer.next();
        System.out.println("Apreciado " + getNombre() + " usted fua asignado a " + getSeccion());
    }

    @Override
    public String toString() {
        return "\nPersonalDeServicio" + super.toString() + "\nSeccion= " + seccion;
    }

}
