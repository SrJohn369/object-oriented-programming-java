package src.objeto;

public class Comida {

    // Atributos
    protected double pesoGramas;
    protected String nomeComida;
    private boolean comidaProta;

    // Getters
    public boolean isComidaProta() {
        return comidaProta;
    }
    
    public double getPesoGramas() {
        return pesoGramas;
    }

    public String getNomeComida() {
        return nomeComida;
    }

    // Métodos
    public void prepararComida(int tempoPreparo)
        throws InterruptedException {

        System.out.println("Preparando comida...");
        Thread.sleep(tempoPreparo);
        this.comidaProta = true;
    }
}
