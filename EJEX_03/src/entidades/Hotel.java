package entidades;

public class Hotel extends Alojamiento {

    protected int cantHabitaciones;

    protected int numCamas;

    protected int cantPisos;

    protected int precioHabitaciones = 50;

    public Hotel(String nombre, String direccion, String localidad, String encargado, int cantHabitaciones,
            int numCamas, int cantPisos) {
        super(nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;

    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public int capacidadHotel() {
        return this.cantHabitaciones * this.cantPisos;
    }

    public int calculoHabitacion() {
        return 50 + (this.capacidadHotel());
    }

    // $50+(

    // $1 x
    // capacidad del hotel)+(valor agregado
    // por restaurante)+(valor

    // agregado por gimnasio) + (valor agregado por limosinas).
    @Override
    public String toString() {
        return "Hotel [cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos
                + ", precioHabitaciones=" + precioHabitaciones + "]";
    }

}
