package entidades;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//@author rembe
public abstract class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;
    Scanner scan;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.
     */
    public char comprobarConsumoEnergetico(char letra) {
        if ((letra == 'A' || letra == 'a' || letra == 'B' || letra == 'b' || letra == 'C' || letra == 'c' || letra == 'D' || letra == 'd' || letra == 'E' || letra == 'e')) {
            consumoEnergetico = Character.toUpperCase(letra);
        } else {
            consumoEnergetico = 'F';
        }
        return consumoEnergetico;
    }

    protected String comprobarColor(String color) {
        if (!(color.equalsIgnoreCase("blanco")) || !(color.equalsIgnoreCase("negro")) || !(color.equalsIgnoreCase("azul")) || !(color.equalsIgnoreCase("rojo")) || !(color.equalsIgnoreCase("gris"))) {
            this.color = "blanco";
        }
        return color;
    }

    public void crearElectrodomestico() {
        scan = new Scanner(System.in);
        precio = 1000.0;
        System.out.println("Va a comprar un electrodomestico");
        System.out.print("Digite el color: ");
        color = scan.next();
        System.out.print("Letra del consumo energetico: ");
        char letra = scan.next().charAt(0);
        consumoEnergetico = comprobarConsumoEnergetico(letra);
        System.out.print("Escriba el peso: ");
        peso = scan.nextInt();
        comprobarColor(color);
    }

    protected void precioFinal() {
        Double precioconLetra;
        switch (consumoEnergetico) {
            case 'A':
                precioconLetra = 1000 + precio;
                break;
            case 'B':
                precioconLetra = 800 + precio;
                break;
            case 'C':
                precioconLetra = 600 + precio;
                break;
            case 'D':
                precioconLetra = 500 + precio;
                break;
            case 'E':
                precioconLetra = 300 + precio;
                break;
            case 'F':
                precioconLetra = 100 + precio;
                break;
            default:
                throw new AssertionError();
        }
        if (peso >= 1 || peso <= 19) {
            precio = 100 + precioconLetra;
        }
        if (peso >= 20 || peso <= 49) {
            precio = 500 + precioconLetra;
        }
        if (peso >= 50 || peso <= 79) {
            precio = 800 + precioconLetra;
        }
        if (peso >= 80) {
            precio = 1000 + precioconLetra;
        }
    }

}
