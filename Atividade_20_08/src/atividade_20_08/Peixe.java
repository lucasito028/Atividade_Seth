/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_20_08;

/**
 *
 * @author Filho
 */
public class Peixe extends Animal implements Pet {

    private String nome;

    public Peixe(String nome) {
        super(0); // Peixes não têm pernas
        this.nome = nome;
    }

    @Override
    public void caminhar() {
        // Peixes não podem caminhar, então você pode deixar esse método vazio.
        System.out.println("Peixe " + nome + " Nadando");
    }

    @Override
    public void comer() {
        System.out.println("Peixe " + nome + " comendo");
    }

    @Override
    public void brincar() {
        System.out.println("Peixe " + nome + " brincando na água");
    }
}
