package Servicio;

import Entidades.Barco;

import java.time.LocalDate;

public class BarcoServicio {

    public Barco crearBarco(String matricula, Double eslora, LocalDate anoFabricacion) {

        return new Barco(matricula, eslora, anoFabricacion);
    }


}
