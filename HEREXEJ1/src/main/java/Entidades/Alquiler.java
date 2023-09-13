package Entidades;

import java.time.LocalDate;
import java.util.UUID;

public class Alquiler {

    private String nombre;
    private String idCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String sitioAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String idCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String sitioAmarre, Barco barco) {
        this.nombre = nombre;
        this.idCliente = UUID.randomUUID().toString();
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.sitioAmarre = sitioAmarre;
        this.barco = barco;
    }
}
