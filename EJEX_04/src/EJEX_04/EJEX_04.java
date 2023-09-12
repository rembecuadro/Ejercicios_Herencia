/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJEX_04;

import Entidades.Alumno;
import Entidades.PersonalDeServicio;
import Entidades.Profesor;

/**
 *
 * @author merce
 */
public class EJEX_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alumno = new Alumno();
        System.out.println(alumno.toString());
        alumno.cambioEstadoCivil();
        System.out.println(alumno.toString());
        alumno.reasignarCurso();
//***********************************************************************        
//        Profesor profesor = new Profesor();
//        profesor.cambiarDepartamento();
//        profesor.cambioEstadoCivil();
//        System.out.println(profesor.toString());
//***********************************************************************
//        PersonalDeServicio personalServicio = new PersonalDeServicio();
//        personalServicio.reasignarDespacho();
//        personalServicio.trasladoSeccion();
//        System.out.println(personalServicio.toString());
    }
}
