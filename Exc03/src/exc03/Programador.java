package exc03;



public class Programador extends Pessoa{

    private String nivel; // Júnior com Jr, Pleno como Pln, Sênior como Sr
    private double horasTrabalhadas;

    // Construtor
    public Programador(String nome, String nivel, double horasTrabalhadas) {
        super(nome);
        this.nivel = nivel;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public void receberSalario() {
        
        double valorHora;
        
        switch (nivel) {
            case "Jr":
                valorHora = 30.0;
                break;
            case "Pln":
                valorHora = 45.0;
                break;
            case "Sr":
                valorHora = 80.0;
                break;
            default:
                System.out.println("Num sei Uai");
                return;
        }

        double salario = valorHora * horasTrabalhadas;
        System.out.println(this.nome + " cebeu o salario de R$" + salario);
        
    }
    
}
