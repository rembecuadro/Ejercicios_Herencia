/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

//@author rembe
import java.util.Scanner;

public abstract class Edificio {

    protected Double ancho;
    protected Double alto;
    protected Double largo;

    public Edificio(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    protected void crearEdificio() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el ancho del edificio: ");
        ancho = leer.nextDouble();
        System.out.print("Ingrese el alto del edificio: ");
        alto = leer.nextDouble();
        System.out.print("Ingrese el largo del edificio: ");
        largo = leer.nextDouble();
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

}
