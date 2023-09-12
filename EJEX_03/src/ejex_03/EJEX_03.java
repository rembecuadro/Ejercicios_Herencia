/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejex_03;

import entidades.Alojamiento;
import entidades.Hotel;
import entidades.Hotel_5;
import java.util.ArrayList;

/**
 *
 * @author rembe
 */
public class EJEX_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Alojamiento> alojamientos = new ArrayList();

        Hotel_5 Hilton = new Hotel_5("Hilton", "Nada", "Argentina", "Juan perez", 10, 5, 5, "a", "no te lo puedo creer",
                50, 4, 5, 5);
        alojamientos.add(Hilton);

        System.out.print(Hilton.calculoHabitacion());
    }

    public void todosLosAlojamientos(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento aux : alojamientos) {
            System.out.println(aux.toString());
        }
    }

    public void todosLosHotelesOrdenados(ArrayList<Alojamiento> alojamientos) {

        ArrayList<Alojamiento> hoteles = new ArrayList<>();

        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Hotel) {
                hoteles.add(aux);
            }
        }

        hoteles.sort(null);

        for (Alojamiento aux : hoteles) {
            
        }
    }
}
