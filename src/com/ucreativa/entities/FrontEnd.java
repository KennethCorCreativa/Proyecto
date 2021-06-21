package com.ucreativa.entities;
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
        super.setLayout(new GridLayout(5,1));
    }
    private void crearComponentes(){

        JLabel lblNombre = new JLabel ("Nombre");
        JLabel lblCedula = new JLabel ("Cedula");
        JLabel lblCantidadNoches = new JLabel ("Cantidad de Noches");
        JLabel lblTipoPago = new JLabel ("Tipo Pago: Efectivo-Tarjeta");
        JLabel lblNacionalidad = new JLabel ("Eres Nacional o Extranjero?");

        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtCantidadNoches = new JTextField();
        JTextField txtTipoPago = new JTextField();
        JTextField txtNacionalidad = new JTextField();

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

        JButton salvar = new JButton("Salvar");

        }

    }








