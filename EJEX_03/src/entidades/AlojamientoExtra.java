package entidades;

public class AlojamientoExtra extends Alojamiento {
    protected boolean privado;
    protected double metrosCuadrados;

    public AlojamientoExtra(String nombre, String direccion, String localidad, String encargado, boolean privado,
            double metrosCuadrados) {
        super(nombre, direccion, localidad, encargado);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "AlojamientoExtra [privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + "]";
    }

}
