package atividade_21_08;


public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(double saldo) {
        super(saldo);
    }


    public double sacar(double valor) {
         return this.saldo -= (valor * 1.01);
    }

    public double calculaTributos(double valor_tributo) {
        
        return this.saldo * (valor_tributo / 100);
        
        
    }
    
}
