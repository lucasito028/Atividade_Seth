package exc02;



public class Gerente extends Pessoa{

   private String especialidade;
    private int cargaHoraria;
    private String nome;


     public Gerente(String nome, String especialidade, int cargaHoraria) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.cargaHoraria = cargaHoraria;
    }

    
    public void receberSalario() {

        double salarioBase = 7000;
        double novoSalario = salarioBase * 1.15;
        System.out.println(nome + " recebeu o salario de R$" + novoSalario);
        
    }
    
}
