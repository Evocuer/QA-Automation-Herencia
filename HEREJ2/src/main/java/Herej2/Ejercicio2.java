package Herej2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Servicio.ElectrodomesticoServicio;
import Servicio.LavadoraServicio;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ElectrodomesticoServicio es = new ElectrodomesticoServicio();
        LavadoraServicio ls = new LavadoraServicio();

        System.out.println("Ingrese los datos del electrodomestico");
        System.out.println("Color:");
        String color = leer.next();
        System.out.println("Letra de consumo:");
        char letra = leer.next().charAt(0);
        System.out.println("Peso:");
        Double peso = leer.nextDouble();

        Electrodomestico e = es.crearElectrodomestico(peso,letra,color);
        System.out.println(e.toString());

        System.out.println("Ingrese los datosde la lavadora");
        System.out.println("Color:");
        String colorL = leer.next();
        System.out.println("Letra de consumo:");
        char letraL = leer.next().charAt(0);
        System.out.println("Peso:");
        Double pesoL = leer.nextDouble();
        System.out.println("Carga:");
        Double carga = leer.nextDouble();

        Electrodomestico e1 = ls.crearLavadora(pesoL, letraL, colorL, carga);
        System.out.println(e1.toString());

    }

}
