package atividade_20_08;


public class Atividade_20_08 {

   
    
    public static void main(String[] args) {
        
        Formiga formiga = new Formiga();
        Peixe peixe = new Peixe("Nemo");
        Cachorro cachorro = new Cachorro(4, "Rex");

        formiga.caminhar();
        formiga.comer();

        System.out.println("\n");

        peixe.caminhar();
        peixe.comer();
        peixe.brincar();

        System.out.println("\n");

        cachorro.caminhar();
        cachorro.comer();
        cachorro.brincar();
        
    }
    
}
