package com.ucreativa.entities;

public abstract class Persona {
    private String nombre;
    private String cedula;
    private int cantidadnoches;
    private String tipopago;
    private String nacionalidad;
    private String correoelectronico;

    public Persona(String nombre, String cedula, int cantidadnoches, String tipopago, String nacionalidad, String correoelectronico) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cantidadnoches = cantidadnoches;
        this.tipopago = tipopago;
        this.nacionalidad = nacionalidad;
    }


    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public String getTipopago() {
        return tipopago;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

}
