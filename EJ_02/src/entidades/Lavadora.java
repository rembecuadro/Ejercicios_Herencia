/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

//@author rembe

public class Lavadora extends Electrodomestico{
    
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.print("Cuanto es la carga de la lavadora: ");
        carga = scan.nextInt();
        precioFinal();
        Lavadora l = new Lavadora(carga, precio, color, consumoEnergetico, peso);
        
    }

    @Override
    protected void precioFinal() {
        if (carga > 30) {
            precio = precio + 500; 
        }
        System.out.println(precio);
    }
    
    
}
