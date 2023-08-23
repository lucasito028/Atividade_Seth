package atividade_21_08;

public class TestaTributavel {
    
    public static void main(String[] args) {
        
        //Sobre Conta Poupanca
            System.out.println("Conta Poupanca");
            
            ContaPoupanca poupanca = new ContaPoupanca(1500);
            poupanca.obterSaldo();
            
            double Parametro = poupanca.depositar(500);
            poupanca.obterSaldo();
            
            Parametro = poupanca.sacar(1000);
            poupanca.obterSaldo();
            
        
        //Sobre Conta Corrente
            System.out.println("\n\nConta Corrente");
            ContaCorrente corrente = new ContaCorrente(1000);
            corrente.obterSaldo();
            
            double parametro_c = corrente.depositar(3000);
            corrente.obterSaldo();
            
            parametro_c = corrente.sacar(1000);
            corrente.obterSaldo();
            double p = corrente.calculaTributos(corrente.saldo);
            
            
        //Sobre Seguro de Vida
            System.out.println("\n\nSeguro de Vida");
            SegurodeVida segurovida = new SegurodeVida();
            double total = segurovida.calculaTributos(corrente.saldo);
            System.out.println("Agora com Desconto: " + total);
            
             
            
    }
}


