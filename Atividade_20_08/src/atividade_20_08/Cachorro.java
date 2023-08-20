
package atividade_20_08;


public class Cachorro extends Animal implements Pet {

    private String nome;
    
    public Cachorro(int pernas, String nome) {
        super(pernas);
        this.nome = nome;
    }

    @Override
    public void caminhar() {
        System.out.println(this.nome + " está Andando");
    }

    @Override
    public void comer() {
        System.out.println(this.nome + " está Comendo");
    }

    @Override
    public void brincar() {
       System.out.println(this.nome + " está Briancando");
    }
    
}
