package entidades;

public class Residencia extends AlojamientoExtra {
    protected int cantidadHabitaciones;
    protected boolean descuentoGremio;
    protected boolean campoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String encargado, boolean privado,
            double metrosCuadrados, int cantidadHabitaciones, boolean descuentoGremio, boolean campoDeportivo) {
        super(nombre, direccion, localidad, encargado, privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

}
