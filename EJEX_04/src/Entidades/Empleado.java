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
public class Empleado extends Persona {

    protected int anioDeIncorporacion;
    protected String despacho;

    public Empleado() {
        crearEmpleado();
    }

    public Empleado(String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(nombre, apellido, DNI, estadoCivil);
    }

    public Empleado(int anioDeIncorporacion, String despacho, String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(nombre, apellido, DNI, estadoCivil);
        this.anioDeIncorporacion = anioDeIncorporacion;
        this.despacho = despacho;
    }

    public int getAnioDeIncorporacion() {
        return anioDeIncorporacion;
    }

    public void setAnioDeIncorporacion(int anioDeIncorporacion) {
        this.anioDeIncorporacion = anioDeIncorporacion;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    protected void crearEmpleado() {
        super.crearPersona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el año de incorporacion: ");
        this.anioDeIncorporacion = leer.nextInt();
        System.out.print("Ingrese el Despacho (string): ");
        this.despacho = leer.next();
    }

    public void reasignarDespacho() {
        System.out.print("Asignar un nuevo despacho al empleado: ");
        this.despacho = leer.next();
        System.out.println("Reasignación Exitosa");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAño de incorporación= " + anioDeIncorporacion + "\nDespacho= " + despacho;
    }

}
