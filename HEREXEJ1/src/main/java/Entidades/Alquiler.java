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

    public Alquiler(String nombre, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String sitioAmarre, Barco barco) {
        this.nombre = nombre;
        this.idCliente = UUID.randomUUID().toString();
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.sitioAmarre = sitioAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getSitioAmarre() {
        return sitioAmarre;
    }

    public void setSitioAmarre(String sitioAmarre) {
        this.sitioAmarre = sitioAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombre='" + nombre + '\'' +
                ", idCliente='" + idCliente + '\'' +
                ", fechaAlquiler=" + fechaAlquiler +
                ", fechaDevolucion=" + fechaDevolucion +
                ", sitioAmarre='" + sitioAmarre + '\'' +
                ", barco=" + barco +
                '}';
    }
}
