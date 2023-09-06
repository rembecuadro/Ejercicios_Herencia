/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

//@author rembe

import java.util.Scanner;

 
public class Polideportivo extends Edificio{
    
    private String nombre;
    private String instalacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
    
    

    public Polideportivo(String nombre, String instalacion, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public Polideportivo(Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
    }
    
    private void crearPolideportivo(){
        super.crearEdificio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el nombre de la instalación: ");
        nombre = leer.next();
        System.out.print("Ingrese el tipo de instalación (abierto/techado): ");
        nombre = leer.next();
        nombre = nombre.toLowerCase();
        
        Polideportivo pol = new Polideportivo(nombre, instalacion, ancho, alto, largo);
    }
@Override
    public void calcularSuperficie() {
        Double superficie = largo * ancho;
        System.out.println("La superficie del piso es: "+superficie);
    }
@Override
    public void calcularVolumen() {
        Double volumen = alto * largo * ancho;
        System.out.println("el volumen del edificio es: "+volumen);
    }
    
    
    
}
