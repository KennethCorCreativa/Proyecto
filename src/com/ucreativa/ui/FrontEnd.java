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
        super.setSize(700,500);
        super.setLayout(new GridLayout(22,2));
    }
    private void crearComponentes(){

        JLabel lblFecha1 = new JLabel ("Indique fecha de llegada");
        JLabel lblFecha2 = new JLabel ("Indique fecha de salida");

        JLabel lblNombre = new JLabel ("Nombre");
        JLabel lblCedula = new JLabel ("Cedula");
        JLabel lblTipoPago = new JLabel ("Indique tipo de pago");
        JLabel lblCantidadNoches = new JLabel ("Cantidad de Noches");
        JLabel lblNacionalidad = new JLabel ("Eres Nacional ($20 por noche) o Extranjero ($25 por noche)?");
        JLabel lblCorreoElectronico = new JLabel ("Corre Electronico");

        JCheckBox lblTipoPago1 = new JCheckBox("Tarjeta");
        JCheckBox lblTipoPago2 = new JCheckBox("Efectivo");
        JCheckBox lblNacional = new JCheckBox("Nacional");
        JCheckBox lblExtranjero = new JCheckBox("Extranjero");


        JTextField txtFecha1 = new JTextField();
        JTextField txtFecha2 = new JTextField();

        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtCantidadNoches = new JTextField();
        JTextField txtTipoPago = new JTextField();
        JTextField txtNacionalidad = new JTextField();
        JTextField txtCorreoElectronico = new JTextField();

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
        this.agregarComponente(lblTipoPago1);
        this.agregarComponente(lblTipoPago2);
        this.agregarComponente(lblNacionalidad);
        this.agregarComponente(lblNacional);
        this.agregarComponente(lblExtranjero);
        this.agregarComponente(lblCorreoElectronico);
        this.agregarComponente(txtCorreoElectronico);


        JButton boton;
        boton = new JButton("Enviar");
        add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton.setText("Se ha enviado su información, en caso de disponibilidad se le va informar.");
            }
        });



        }

    }








