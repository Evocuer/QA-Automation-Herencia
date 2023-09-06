package Entidades;

public class Electrodomestico {

    private Double precio;
    private String color;
    private char consumoEnergetico;
    private Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }


    private char comprobarConsumoEnergetico(char letra) {

        char letraM = Character.toUpperCase(letra);

        return switch (letraM) {
            case 'A' -> letraM;
            case 'B' -> letraM;
            case 'C' -> letraM;
            case 'D' -> letraM;
            case 'E' -> letraM;
            case 'F' -> letraM;
            default -> 'F';
        };
    }

    private String comprobarColor(String color) {

        String colorM = color.toLowerCase();

        return switch (colorM) {
            case "blanco" -> colorM;
            case "negro" -> colorM;
            case "rojo" -> colorM;
            case "gris" -> colorM;
            default -> "blanco";
        };
    }

    public Electrodomestico crearElectrodomestico(String color, char consumoEnergetico, Double peso) {



    }


}


