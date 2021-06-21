package com.ucreativa.ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontEnd extends JFrame {

    public FrontEnd(String ReservaHotel) {
        super(ReservaHotel);
    }
    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
    }
    public void build(){
        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }
    private void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(500,300);
        super.setLayout(new GridLayout(10,2));
    }
    private void crearComponentes(){

        JLabel lblFecha1 = new JLabel ("Indique fecha de llegada");
        JLabel lblFecha2 = new JLabel ("Indique fecha de salida");

        JLabel lblNombre = new JLabel ("Nombre");
        JLabel lblCedula = new JLabel ("Cedula");
        JLabel lblCantidadNoches = new JLabel ("Cantidad de Noches");
        JLabel lblTipoPago = new JLabel ("Tipo Pago: Efectivo-Tarjeta");
        JLabel lblNacionalidad = new JLabel ("Eres Nacional o Extranjero?");

        JTextField txtFecha1 = new JTextField();
        JTextField txtFecha2 = new JTextField();

        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtCantidadNoches = new JTextField();
        JTextField txtTipoPago = new JTextField();
        JTextField txtNacionalidad = new JTextField();

        this.agregarComponente(lblFecha1);
        this.agregarComponente(txtFecha1);
        this.agregarComponente(lblFecha2);
        this.agregarComponente(txtFecha2);
        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblCedula);
        this.agregarComponente(txtCedula);
        this.agregarComponente(lblCantidadNoches);
        this.agregarComponente(txtCantidadNoches);
        this.agregarComponente(lblTipoPago);
        this.agregarComponente(txtTipoPago);
        this.agregarComponente(lblNacionalidad);
        this.agregarComponente(txtNacionalidad);

        JLabel etiqueta;
        JButton boton;
        boton = new JButton("Enviar");
        etiqueta = new JLabel("");
        add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("Se ha confirmado su reserva");
            }
        });



        }



    }








