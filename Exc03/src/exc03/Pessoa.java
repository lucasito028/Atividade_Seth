
package exc03;



abstract class Pessoa {
    String nome;
    
    public Pessoa(String nome){
    this.nome = nome;
    }
    public abstract void receberSalario();
}
