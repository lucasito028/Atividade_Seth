
package atividade_21_08;


public class ContaPoupanca extends Conta{

    
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

     public double sacar(double valor) {
         return this.saldo -= valor;
    }
    
}
