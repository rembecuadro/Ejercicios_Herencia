/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_01;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rembe
 */
public class EJ_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Animal> listaAnimales = new ArrayList<>();

        Animal perro1 = new Perro("Stich", 15, "Carnivoro", "Doberman");

        Animal perro2 = new Perro("Teddy", 10, "Croquetas", "Chihuahua");

        Animal c = new Gato("Pelusa", 15, "Galletas", "Siamés");

        Animal caballo1 = new Caballo("Spark", 25, "Pasto", "Fino");

        listaAnimales.add(perro1);
        listaAnimales.add(perro2);
        listaAnimales.add(caballo1);
        listaAnimales.add(c);

        for (Animal aux : listaAnimales) {
            aux.alimentacion();
        }

    }
}


