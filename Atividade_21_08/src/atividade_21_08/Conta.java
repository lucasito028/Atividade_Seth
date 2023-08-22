package atividade_21_08;


abstract class Conta {
    
    protected double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    abstract double sacar(double valor);
    
    public double depositar(double valor){
        return this.saldo += valor;
    }
    
    public void obterSaldo() {
        System.out.println("Saldo é: " + this.saldo);
    }
            
}
