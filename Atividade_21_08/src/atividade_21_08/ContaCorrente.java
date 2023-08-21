package atividade_21_08;


public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(double saldo) {
        super(saldo);
    }


    void sacar(double n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void depositar(double n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double calculaTributos(double valor) {
        
        return 0;
        
    }
    
}
