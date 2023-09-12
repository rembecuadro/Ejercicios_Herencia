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
public class Persona {

    protected String nombre;
    protected String apellido;
    protected Integer DNI;
    protected String estadoCivil;
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer DNI, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estadoCivil = estadoCivil;
    }

    protected void crearPersona() {
        System.out.print("Ingrese su Nombre: ");
        nombre = leer.next();
        System.out.print("Ingrese su Apellido: ");
        apellido = leer.next();
        System.out.print("Ingrese su DNI: ");
        DNI = leer.nextInt();
        System.out.print("Ingrese su estado civil: ");
        estadoCivil = leer.next();
    }

    protected void cambioEstadoCivil() {
        System.out.print("Ingrese el nuevo estado civil: ");
        this.estadoCivil = leer.next();
    }

    @Override
    public String toString() {
        return "\nNombre= " + nombre + " " + apellido
                + "\nDNI= " + DNI
                + "\nEstado Civil= " + estadoCivil;
    }

}
