
package javaveiculo;


abstract public class Veiculo {
    public String modelo;
    public float velocidade;
    public int passageiro;
    public float combustivel;
    
    public Veiculo(String modelo, float velocidade, int passageiro, float combustivel){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.passageiro = passageiro;
        this.combustivel = combustivel;
    }
    
    public void setVelocidade (float v){
    velocidade = v;
    }
    
    public float getVelocidade (){
    return velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }
    
    
    public void acelerar(){
        System.out.println("Vrum Vrum\n");
    }
    
    public void freiar(){
        System.out.println("PRIIIIIIIII\n");
    }
    
    
            
    
}
