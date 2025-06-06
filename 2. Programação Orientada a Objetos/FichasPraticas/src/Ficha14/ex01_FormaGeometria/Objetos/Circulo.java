package Ficha14.ex01_FormaGeometria.Objetos;

import java.util.Objects;

public class Circulo extends FiguraGeometria{

    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}
