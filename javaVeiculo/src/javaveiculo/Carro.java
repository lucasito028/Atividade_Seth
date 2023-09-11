package javaveiculo;



public class Carro extends Veiculo{
    
    int marcha;
    
    public Carro(String modelo, float velocidade, int passageiro, float combustivel) {
        super(modelo, velocidade, passageiro, combustivel);
    }
    
    
    @Override
    public void setVelocidade (float v){
    velocidade = v;
    
    if(velocidade < 20){
        marcha = 1;
    }
    
    else if(velocidade >= 20 && velocidade < 40){
        marcha = 2;
    }
    
    else if(velocidade >= 40 && velocidade < 60){
        marcha = 3;
    }
    
    else if(velocidade >= 60 && velocidade < 70){
        marcha = 4;
    }
    
    else{
        marcha = 5;
    }
    
    }
    
    @Override
    public void acelerar(){
        setVelocidade (getVelocidade() + 2.f);
    }
    
    @Override
    public void freiar(){
        setVelocidade (getVelocidade() -2.f);
    }
}
