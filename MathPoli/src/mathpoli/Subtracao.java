package mathpoli;



public class Subtracao extends Operacao{

    @Override
    void calcular(double a, double b) {
        res = a - b;
        System.out.println("Valor da Subtracao\n"+ a 
                + " - " + b + " == " + res);
    }
    
}
