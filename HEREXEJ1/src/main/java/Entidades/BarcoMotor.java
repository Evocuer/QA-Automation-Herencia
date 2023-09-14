package Entidades;

import java.time.LocalDate;

public class BarcoMotor extends Barco {

    private Double potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(String matricula, Double eslora, LocalDate anoFabricacion, Double potenciaCV) {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" +
                "potenciaCV=" + potenciaCV +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anoFabricacion=" + anoFabricacion +
                '}';
    }
}
