package Entidades;

public class Televisor extends Electrodomestico {

    private Double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double precio, String color, char consumoEnergetico, Double peso, Double resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
}
