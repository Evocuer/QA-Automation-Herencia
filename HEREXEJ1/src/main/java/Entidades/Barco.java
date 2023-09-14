package Entidades;

import java.time.LocalDate;

public class Barco {

    protected String matricula;
    protected Double eslora;
    protected LocalDate anoFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, LocalDate anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(LocalDate anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anoFabricacion=" + anoFabricacion +
                '}';
    }
}
