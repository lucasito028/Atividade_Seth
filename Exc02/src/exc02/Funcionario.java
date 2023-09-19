package exc02;



public class Funcionario extends Pessoa{

    protected String nome;
    protected String cpf;
    protected double salario;

    // Construtor
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Método sobreposto para receber salário com acréscimo de 10%
    @Override
    public void receberSalario() {
        double novoSalario = salario * 1.10;
        System.out.println(nome + " Cebeu o salario de R$" + novoSalario);
    }
    
}
