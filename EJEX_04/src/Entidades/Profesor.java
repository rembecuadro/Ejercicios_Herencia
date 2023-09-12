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
public class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
        crearProfesor();
    }

    public Profesor(String deparmento, String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(nombre, apellido, DNI, estadoCivil);
        this.departamento = departamento;
    }

    public Profesor(String departamento, int anioDeIncorporacion, String despacho, String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(anioDeIncorporacion, despacho, nombre, apellido, DNI, estadoCivil);
        this.departamento = departamento;
    }

    public String getdepartamento() {
        return departamento;
    }

    public void setSeccion(String departamento) {
        this.departamento = departamento;
    }

    private void crearProfesor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el departamento (string)");
        this.departamento = leer.next();
    }

    @Override
    public void reasignarDespacho() {
        super.reasignarDespacho();
    }

    public void cambiarDepartamento() {
        System.out.print("Digite el nuevo departamento del profesor: ");
        this.departamento = leer.next();
        System.out.println("Profesor " + getNombre() + " usted está ahora en el departamento de " + getdepartamento());
    }

    @Override
    public String toString() {
        return "\nProfesor" + super.toString() + "\nDepartamento= " + departamento;
    }
}
