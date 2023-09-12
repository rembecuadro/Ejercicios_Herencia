package entidades;

public class Camping extends AlojamientoExtra {
    protected int capacidadCarpas;
    protected int bañosDisponibles;
    protected boolean restaurante;

    public Camping(String nombre, String direccion, String localidad, String encargado, boolean privado,
            double metrosCuadrados, int capacidadCarpas, int bañosDisponibles, boolean restaurante) {
        super(nombre, direccion, localidad, encargado, privado, metrosCuadrados);
        this.capacidadCarpas = capacidadCarpas;
        this.bañosDisponibles = bañosDisponibles;
        this.restaurante = restaurante;
    }

}
