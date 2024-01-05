/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Gerente extends Empleado {
    private final ArrayList<Empleado> empleadosACargo;

    public Gerente(String nombre, String cargo, String idEmpleado, int edad, String email, String telefono) {
        super(nombre, cargo, idEmpleado, 21, email, telefono);
        this.empleadosACargo = new ArrayList<>();
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Empleados a Cargo: " + empleadosACargo);
    }

}