
package atividade_20_08;

public class Formiga extends Animal {
    public Formiga() {
        super(6); // Formigas têm 6 pernas
    }

    @Override
    public void caminhar() {
        System.out.println("Formiga caminhando");
    }

    @Override
    public void comer() {
        System.out.println("Formiga comendo");
    }
}
