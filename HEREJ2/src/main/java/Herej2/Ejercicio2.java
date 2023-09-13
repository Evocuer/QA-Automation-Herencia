package Herej2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicio.ElectrodomesticoServicio;
import Servicio.LavadoraServicio;
import Servicio.TelevisorServicio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ElectrodomesticoServicio es = new ElectrodomesticoServicio();
        LavadoraServicio ls = new LavadoraServicio();
        TelevisorServicio ts = new TelevisorServicio();

        ArrayList <Electrodomestico> listaElec = new ArrayList<>();

        Electrodomestico e1 = ls.crearLavadora(45d, 'B', "Negro", 20d);
        Electrodomestico e2 = ls.crearLavadora(45d, 'B', "Blanco", 20d);
        Electrodomestico e3 = ts.crearTelevisor(20d, 'A', "Negro", 45d, true);
        Electrodomestico e4 = ts.crearTelevisor(15d, 'B', "Negro", 37d, true);

        listaElec.add(e1);
        listaElec.add(e2);
        listaElec.add(e3);
        listaElec.add(e4);

        Double lavTotal = 0d;
        Double tvTotal = 0d;

        for (Electrodomestico aux : listaElec) {
            if (aux instanceof Lavadora) {
                System.out.println("Lavadora " + "= " + aux.getPrecio());
                lavTotal += aux.getPrecio();
                continue;
            }

            if (aux instanceof Televisor) {
                System.out.println("Televisor " + "= " + aux.getPrecio());
                tvTotal += aux.getPrecio();
            }
        }

        System.out.println("El costo total de los electrodomesticos es: $" + (lavTotal+tvTotal));
        System.out.println("Lavadoras: $" + lavTotal);
        System.out.println("Televisores: $" + tvTotal);

    }

}
