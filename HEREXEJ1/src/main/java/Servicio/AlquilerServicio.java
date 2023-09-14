package Servicio;

import Entidades.Alquiler;
import Entidades.Barco;

import java.time.LocalDate;

public class AlquilerServicio {

    public Alquiler crearAlquilar(String nombre, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String sitioAmarre, Barco barco) {

        return new Alquiler(nombre, fechaAlquiler, fechaDevolucion, sitioAmarre, barco);
    }

}
