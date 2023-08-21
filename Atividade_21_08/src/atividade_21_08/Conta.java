package atividade_21_08;



abstract class Conta {
    
    protected double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    abstract void sacar(double n);
    
    abstract void depositar(double n);
            
}
