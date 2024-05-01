package src.banco;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    public String titular;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}