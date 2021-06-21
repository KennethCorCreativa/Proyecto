package com.ucreativa;

import com.ucreativa.ui.FrontEnd;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        FrontEnd fe = new FrontEnd("Reserva de Hotel");
        fe.build();

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce fecha de entrada: ");
        String fechaentrada = sc.nextLine();
        System.out.println("Introduce fecha de salida: ");
        String fechasalida = sc.nextLine();
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu cedula: ");
        String cedula = sc.nextLine();
        System.out.println("Introduce cantidad de noches: ");
        String cantidadnoches = sc.nextLine();
        System.out.println("Tipo de pago: Efectivo o Tarjeta");
        String tipopago = sc.nextLine();
        System.out.println("Eres nacional o Extranjero?: ");
        String nacionalidad = sc.nextLine();
        System.out.println("Introduce tu Correo Electronico: ");
        String correoelectronico = sc.nextLine();

        if (nacionalidad.equals("Nacional")){
            System.out.println("Su tarifa es $20 por noche");

        }else{
            System.out.println("Su tarifa es $25 por noche");
        }

        System.out.println("Se ha enviado su información, en caso de disponibilidad se le va informar.");

    }
}
