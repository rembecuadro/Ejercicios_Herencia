package entidades;

public class Animal {

    protected String nombre;
    protected Integer edad;
    protected String alimento;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, Integer edad, String alimento, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public Animal setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Integer getEdad() {
        return edad;
    }

    public Animal setEdad(Integer edad) {
        this.edad = edad;
        return this;
    }

    public String getAlimento() {
        return alimento;
    }

    public Animal setAlimento(String alimento) {
        this.alimento = alimento;
        return this;
    }

    public String getRaza() {
        return raza;
    }

    public Animal setRaza(String raza) {
        this.raza = raza;
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", alimento='" + alimento + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }

    public void alimentacion(){
        System.out.println(getAlimento());
    }
}
