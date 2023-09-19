package exc03;



public class Vendedor extends Pessoa{

    // Atributos da classe Vendedor
    private double vendas;

    // Construtor
    public Vendedor(String nome, double vendas) {
        super(nome);
        this.vendas = vendas;
    }

    // Método sobreposto para receber salário
    @Override
    public void receberSalario() {
        double salarioFixo = 2000.0;
        double comissao = vendas * 0.20; // Comissão de 20%
        double salario = salarioFixo + comissao;
        System.out.println(nome + " cebeu o salario de R$" + salario);
    }
    
}
