package entidades;

public final class Hotel_5 extends Hotel_4 {

    private int cantSalonesConferencia;

    private int cantSuites;

    private int cantLimosinas;

    public Hotel_5(String nombre, String direccion, String localidad, String encargado, int cantHabitaciones,
            int numCamas, int cantPisos, String gimnasio, String nombreRestaurante,
            int capacidadRestaurante, int cantSalonesConferencia, int cantSuites, int cantLimosinas) {
        super(nombre, direccion, localidad, encargado, cantHabitaciones, numCamas, cantPisos,
                gimnasio, nombreRestaurante, capacidadRestaurante);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public int valorAgregadoLimosinas() {
        return this.cantLimosinas * 15;
    }

    @Override
    public int calculoHabitacion() {
        // TODO Auto-generated method stub
        return super.calculoHabitacion() + this.valorAgregadoLimosinas();
    }

    @Override
    public String toString() {
        return "Hotel_5 [cantSalonesConferencia=" + cantSalonesConferencia + ", cantSuites=" + cantSuites
                + ", cantLimosinas=" + cantLimosinas + "]";
    }

}
