/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaveiculo;

/**
 *
 * @author aluno
 */
public class JavaVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro corsa = new Carro("Classic", 0, 4, 48.f);
        
        System.out.println("Modelo :" + corsa.modelo);
        System.out.println("Velocidade :" + corsa.velocidade);
        System.out.println("Passageiros :" + corsa.passageiro);
        System.out.println("Combustivel :" + corsa.combustivel);

        System.out.println("Acelerando");

        int a = 0;

        for(a = 0; a <= 10; a++){
            corsa.acelerar();

            System.out.println("Marcha :" + corsa.marcha);
            System.out.println("Velocidade :" + corsa.getVelocidade());
        }

        System.out.println("Desacelerar");

        int b = 10;

        while(b != 0){
            corsa.freiar();

            System.out.println("Marcha :" + corsa.marcha);
            System.out.println("Velocidade :" + corsa.getVelocidade());
            b--;
        }
        
        
    }
    
}
