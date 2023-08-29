/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

//@author rembe
 
public class Televisor extends Electrodomestico{
    
    private Integer resolucion;
    private boolean tdt = true;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean tdt, Double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }
    
    public void crearTelevisor(){
        crearElectrodomestico();
        resolucion = scan.nextInt();
        tdt = scan.nextBoolean();
    }
    
    @Override
    public void precioFinal() {
        if (resolucion > 40){
            precio = (precio*0.7); 
        } if (tdt) {
            precio = precio+500 ;
        } 
    }
}
