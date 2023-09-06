/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_02;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author rembe
 */
public class EJ_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        *************************************************************************************
        Para utilizar  el código con datos ingresado por el usuario, descomentar las lineas
        de la 30 a la 34.
        *************************************************************************************
         */
        
//        Lavadora lavadora = new Lavadora();
//        lavadora.crearLavadora();
//
//        Televisor televisor = new Televisor();
//        televisor.crearTelevisor();

        /*
        *************************************************************************************
        Para utilizar hardcoded , comentar las lineas
        de la 43 a la 74.
        *************************************************************************************
         */
        
        double precioTotal, precioTotalLavadora = 0, precioTotalTelevisor = 0;
        ArrayList<Electrodomestico> bolsa = new ArrayList<>();

        Lavadora lav1 = new Lavadora(20, 1000.0, "naranja", 'F', 20);
        Lavadora lav2 = new Lavadora(40, 1000.0, "azul", 'b', 90);
        lav1.comprobarColor("naranja");
        System.out.println(lav1.getColor());

        bolsa.add(lav1);
        bolsa.add(lav2);

        Televisor tv1 = new Televisor(32, false, 1000.0, "negro", 'D', 7);
        Televisor tv2 = new Televisor(50, true, 1000.0, "gris", 'E', 10);
        bolsa.add(tv1);
        bolsa.add(tv2);

        for (Electrodomestico aux : bolsa) {
            if (aux instanceof Lavadora) {
                aux.precioFinal();
                precioTotalLavadora += aux.getPrecio();
            }

            if (aux instanceof Televisor) {
                aux.precioFinal();
                precioTotalTelevisor += aux.getPrecio();
            }
        }

        System.out.print("\nTotal precio lavadoras: \t$");
        System.out.println(precioTotalLavadora);
        System.out.print("\nTotal precio televisores: \t$");
        System.out.println(precioTotalTelevisor);
        System.out.print("\nGran Total electrodomesticos: \t$");
        System.out.println(precioTotal = precioTotalLavadora + precioTotalTelevisor);
        System.out.println("");
    }
}
