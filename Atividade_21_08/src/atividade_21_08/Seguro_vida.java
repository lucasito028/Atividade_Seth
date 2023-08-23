package atividade_21_08;


public class Seguro_vida implements Tributavel{

    /*Esse valor pode ser alterado quando quiser
    Ou seja é apenas um exemplo*/
    
    public double calculaTributos(double valor){
        
        System.out.println("Valor total: " + valor);
        System.out.println("Desconto de: 42,00");
        
        return valor - 42.00;
    }
    
    
}
