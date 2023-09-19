package exc03;



public class Gerente extends Pessoa{


    private double horasTrabalhadas;


    public Gerente(String nome, double horasTrabalhadas) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
    }


    @Override
    public void receberSalario() {
        
        double valorHora = 100.0;
        double salario = valorHora * horasTrabalhadas;
        double bonus = salario * 0.10; // Bonus de 10%
        salario += bonus;
        System.out.println(nome + " cebeu o salario de R$" + salario);
    }
    
}
