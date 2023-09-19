/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exc03;

/**
 *
 * @author Filho
 */
public class Exc03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Programador programadorJunior = new Programador("Jpleu", "Sr", 48.0);
        programadorJunior.receberSalario();

        Gerente gerente = new Gerente("Lola", 160.0);
        gerente.receberSalario();

        Vendedor vendedor = new Vendedor("Ito", 50000.0);
        vendedor.receberSalario();    }
    
}
