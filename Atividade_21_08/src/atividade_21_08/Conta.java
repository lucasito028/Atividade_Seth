package atividade_21_08;


abstract class Conta {
    
    protected double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    abstract double sacar(double valor);
    
    //Todos as classes podem sacar já que é a mesma coisa
    public double depositar(double valor){
        return this.saldo += valor;
    }
    
    //Todos as classes podem obter seus saudo 
    public void obterSaldo() {
        System.out.println("Saldo é: " + this.saldo);
    }
            
}
