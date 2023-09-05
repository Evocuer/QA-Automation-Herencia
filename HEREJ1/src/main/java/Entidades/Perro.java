package Entidades;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }


    @Override
    public void alimentarse() {
        System.out.println(nombre + "Se alimenta de: " + alimento);
    }
}
