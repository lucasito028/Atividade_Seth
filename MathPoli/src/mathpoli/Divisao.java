package mathpoli;



public class Divisao extends Operacao{


    void calcular(double a, double b) {
        
        if(a != 0 && b != 0){
        res = a / b;
        System.out.println("Valor da Divisao\n"+ a 
                + " / " + b + " == " + res);
        }else{
            System.out.println("Deu Pauuu\n");}
    }
    
}
