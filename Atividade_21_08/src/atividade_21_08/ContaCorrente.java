package atividade_21_08;


public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public double calculaTributos(double valor) {
        
        
        System.out.println("Agora valor com a Tributação Descontando: "+ (this.saldo / 100));
        this.saldo -= (this.saldo / 100);
        System.out.println("Valor: " + this.saldo);
        return this.saldo;
             
    }


}

