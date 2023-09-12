package entidades;

public class Alojamiento {

    protected String nombre;

    protected String direccion;

    protected String localidad;

    protected String encargado;

    public Alojamiento(String nombre, String direccion, String localidad, String encargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.encargado = encargado;
    }

}
