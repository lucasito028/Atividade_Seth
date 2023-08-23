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
            ContaCorrente corrente = new ContaCorrente(1500);
            corrente.obterSaldo();
            
            double parametro_c = corrente.depositar(1000);
            corrente.obterSaldo();
            
            parametro_c = corrente.sacar(1000);
            corrente.obterSaldo();
            
            
        //Sobre Seguro de Vida
            System.out.println("\n\nSeguro de Vida");
            Seguro_vida segurovida = new Seguro_vida();
            double total = segurovida.calculaTributos(1000);
            System.out.println("Agora com Desconto: " + total);
            
             
            
    }
}
