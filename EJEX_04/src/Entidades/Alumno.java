/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author merce
 */
public class Alumno extends Persona {

    private ArrayList<String> cursos;

    public Alumno() {
        crearAlumno();
    }

    public Alumno(ArrayList<String> cursos, String nombre, String apellido, Integer DNI, String estadoCivil) {
        super(nombre, apellido, DNI, estadoCivil);
        this.cursos = cursos;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    private void crearAlumno() {
        super.crearPersona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        cursos = new ArrayList<>();
        String curso;

        System.out.print("Ingrese el Curso a Matricularse: ");
        curso = leer.next();

        do {
            cursos.add(curso);
            System.out.print("Ingrese otro curso a matricularse? ('No' para salir): ");
            curso = leer.next();
        } while (!curso.equalsIgnoreCase("no"));
    }

    @Override
    public void cambioEstadoCivil() {
        super.cambioEstadoCivil();
    }

    public void reasignarCurso() {

        if (this.cursos.isEmpty()) {
            System.out.println("No tiene cursos matriculados");

        } else {
            System.out.println("Cursos Matriculados: " + cursos.toString());
            System.out.println("Ingrese el curso que desea cambiar");
            String cambioCurso = leer.next();
            System.out.println("Ingrese el nuevo curso");
            String nuevoCurso = leer.next();
            cursos.removeIf(cursos -> cursos.contains(cambioCurso));
            cursos.add(nuevoCurso);
            System.out.println("Cambio Exitoso");
            System.out.println(cursos.toString());
        }
    }

    @Override
    public String toString() {
        return "\nAlumno" + super.toString() + "\nCursos matriculados: " + cursos.toString();
    }

}
