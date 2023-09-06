package Entidades;

public class Lavadora extends Electrodomestico{

    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double precio, String color, char consumoEnergetico, Double peso, Double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
}
