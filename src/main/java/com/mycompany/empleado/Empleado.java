/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleado;

/**
 *
 * @author USUARIO
 */

public class Empleado {
    private String nombre;
    private String cargo;
    private String idEmpleado;
    private int edad;
    private String email;
    private String telefono;

    // Constructor
    public Empleado(String nombre, String cargo, String idEmpleado, int edad, String email, String telefono) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.idEmpleado = idEmpleado;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Para mostrar la info
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Edad: " + edad);
        System.out.println("Email: " + email);
        System.out.println("Teléfono: " + telefono);
    }
    public static void main(String[] args) {
        // Crear instancia de Empleado y mostrar información
        Empleado empleado = new Empleado("Joe", "Programador", "001", 21, "jagavilanez4@espe.edu.ec", "0983994438");
        empleado.mostrarInformacion();
        
    }
}