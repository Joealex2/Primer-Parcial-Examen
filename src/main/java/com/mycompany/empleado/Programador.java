/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;


/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;

public class Programador extends Empleado {
    private ArrayList<String> habilidades;

    public Programador(String nombre, String cargo, String idEmpleado, int edad, String email, String telefono) {
        super(nombre, cargo, idEmpleado, edad, email, telefono);
        this.habilidades = new ArrayList<>();  // Inicializa la lista en el constructor
    }

    // Getters y Setters para habilidades

    public void agregarHabilidad(String habilidad) {
        habilidades.add(habilidad);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Habilidades: " + habilidades);
    }

    public static void main(String[] args) {
        Programador programador = new Programador("Ana", "Programador", "002", 28, "ana@example.com", "987-654-3210");
        programador.agregarHabilidad("Java");
        programador.agregarHabilidad("Python");
        programador.mostrarInformacion();
    }
}
