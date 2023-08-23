package atividade_21_08;


public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(double saldo) {
        super(saldo);
    }


    public double sacar(double valor) {
        double p = calculaTributos(valor);
        return this.saldo -= p;
    }

    public double calculaTributos(double valor_tributo) {
        
        System.out.println("Valor do desconto: " + valor_tributo);
        System.out.println("Valor do Tributo: " + valor_tributo / 100);
        
        return valor_tributo * 1.01;
        
        
    }
    
}
