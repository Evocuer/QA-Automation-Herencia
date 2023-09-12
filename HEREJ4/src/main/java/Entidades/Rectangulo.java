package Entidades;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {

    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public void area() {
        System.out.println("El area del rectangulo es: " + (base * altura));
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro del rectangulo es: " + ((2 * base) + (2 * altura)));
    }
}
