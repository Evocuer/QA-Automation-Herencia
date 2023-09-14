package Entidades;

import java.time.LocalDate;

public class Velero extends Barco{

    private Integer numMastiles;

    public Velero() {

    }

    public Velero(String matricula, Double eslora, LocalDate anoFabricacion, Integer numMastiles) {
        super(matricula, eslora, anoFabricacion);
        this.numMastiles = numMastiles;
    }

    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }


    @Override
    public String toString() {
        return "Velero{" +
                "numMastiles=" + numMastiles +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anoFabricacion=" + anoFabricacion +
                '}';
    }
}
