package com.ucreativa.entities;

public abstract class Persona {
    private String nombre;
    private String cedula;
    private int edad;
    private String tipopago;

    public Persona(String nombre, String ceduda, int edad, String tipopago) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.tipopago = tipopago;
    }


    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public int getEdad() {
        return edad;
    }
    public String getTipopago() {
        return tipopago;
    }

}
