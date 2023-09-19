package jvpessoa;



public class Jvpessoa {

  
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Klepeo", "123456789", 3000.0);
        funcionario.receberSalario();

        // Criando um gerente
        Gerente gerente = new Gerente("Maria", "TI", 40);
        gerente.receberSalario();
    }
    
}
