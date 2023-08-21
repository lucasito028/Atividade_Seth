
package atividade_21_08;


abstract public class ContaPoupanca extends Conta{

    
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    void sacar(double n) {
        this.saldo -= n;
    }
        

    void depositar(double n) {
       this.saldo += n;
    }

    
}
