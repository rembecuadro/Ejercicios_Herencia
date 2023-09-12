package entidades;

public class Hotel_4 extends Hotel {

    protected String gimnasio;

    protected String nombreRestaurante;

    protected int capacidadRestaurante;

    public Hotel_4(String nombre, String direccion, String localidad, String encargado, int cantHabitaciones,
            int numCamas, int cantPisos, String gimnasio, String nombreRestaurante,
            int capacidadRestaurante) {
        super(nombre, direccion, localidad, encargado, cantHabitaciones, numCamas, cantPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    // public int calculoHabitacion() {
    // return 50 + (super.capacidadHotel());
    // }

    public int valorGimnasio() {
        if (this.gimnasio.equalsIgnoreCase("a")) {
            return 50;
        } else {
            return 30;
        }
    }

    public int valorRestaurante() {
        if (this.capacidadRestaurante < 30) {
            return 10;
        } else if (this.capacidadRestaurante < 50) {
            return 30;
        } else {
            return 50;
        }
    }

    @Override
    public String toString() {
        return "Hotel_4 [gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante="
                + capacidadRestaurante + "]";
    }

    @Override
    public int calculoHabitacion() {
        // TODO Auto-generated method stub
        return super.calculoHabitacion() + this.valorRestaurante() + this.valorGimnasio();
    }

}
