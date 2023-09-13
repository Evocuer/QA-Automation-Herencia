package Entidades;

import Interfaces.calculosFormas;

import static java.lang.Math.*;

public class Circulo implements calculosFormas {

    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public void area() {
        System.out.println("El area del circulo es: " + (PI * pow(radio, 2)));
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro del circulo es: " + (2 * PI * radio));
    }
}
