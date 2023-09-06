/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejex_02;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author rembe
 */
public class EJEX_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int totalTechados = 0, totalAbiertos = 0;
        ArrayList<Edificio> edificios = new ArrayList<>();

        Polideportivo pol1 = new Polideportivo("Polideportivo Candela", "techado", 20.0, 20.0, 20.0);
        Polideportivo pol2 = new Polideportivo("Polideportivo Ingrid", "techado", 30.0, 20.0, 15.0);
        Polideportivo pol3 = new Polideportivo("Polideportivo Ivan", "abierto", 30.0, 30.0, 20.0);

        EdificioDeOficinas edOf1 = new EdificioDeOficinas(2, 10, 5, 10.0, 10.0, 20.0);
        EdificioDeOficinas edOf2 = new EdificioDeOficinas(4, 4, 10, 20.0, 20.0, 20.0);

        edificios.add(pol1);
        edificios.add(pol2);
        edificios.add(pol3);
        edificios.add(edOf1);
        edificios.add(edOf2);

        for (Edificio aux : edificios) {
            System.out.println("\n" + aux.getClass().getSimpleName());
            System.out.println("");
            aux.calcularSuperficie();
            aux.calcularVolumen();
            

            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).getInstalacion().equals("techado")) {
                    totalTechados = totalTechados + 1;
                }
                if (((Polideportivo) aux).getInstalacion().equals("abierto")) {
                    totalAbiertos = totalAbiertos + 1;
                }
            }
            if (aux instanceof EdificioDeOficinas) {
                
                ((EdificioDeOficinas) aux).cantPersonas();

            }

        }
        System.out.println("*************************************");
        System.out.println("Hay " + totalTechados + " edificios techados");
        System.out.println("Hay " + totalAbiertos + " edificios abiertos");

    }

}
