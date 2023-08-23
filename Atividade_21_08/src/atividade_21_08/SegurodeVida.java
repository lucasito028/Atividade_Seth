package atividade_21_08;


public class SegurodeVida implements Tributavel {

    public double calculaTributos(double valor) {
        System.out.println("Valor total: " + valor);
        System.out.println("Desconto de: 42,00");
        
        return valor - 42.00;
    }
   
}

