package atividade_20_08;


public abstract class Animal {
    protected int pernas;

    public Animal(int pernas) {
        this.pernas = pernas;
    }

    public abstract void caminhar();

    public abstract void comer();
}