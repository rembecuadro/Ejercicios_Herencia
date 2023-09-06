/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

//@author rembe

import java.util.Scanner;

 
public class EdificioDeOficinas extends Edificio{
    
    private Integer numeroOficinas;
    private Integer cantidadPersonas; // Cantidad de personas por oficina
    private Integer numeroPisos;

    public EdificioDeOficinas(Integer numeroOficinas, Integer cantidadPersonas, Integer numeroPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.numeroPisos = numeroPisos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Integer numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
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
    
    
    
    Scanner leer = new Scanner(System.in);
    
    public void crearEdificioOficinas() {
        super.crearEdificio();
        System.out.print("Ingrese el número de oficinas de un piso: ");
        numeroOficinas = leer.nextInt();
        System.out.println("Ingrese cantidad de personas en esa oficina");
        cantidadPersonas = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos del edificio");
        numeroPisos = leer.nextInt();
        
        EdificioDeOficinas edifOficinas = new EdificioDeOficinas(numeroOficinas, cantidadPersonas, numeroPisos, ancho, alto, largo);
    }
    
    public void cantPersonas(){
       Integer persPiso = numeroOficinas * cantidadPersonas;
        System.out.println("Hay "+persPiso+" personas en un solo piso");
       Integer persEdificio = persPiso * numeroPisos;
        System.out.println("Hay "+persEdificio+" personas en todo el edificio");
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
