/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author klemavilanova
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        consumo n1 = new consumo();
        n1.setLitros(50f);
        n1.setPGas(1.57f);
        consumo n2 = new consumo(34f, 232f, 10f,1.4f);
        System.out.println(n2.consumomedio());
        n2.setLitros(70f);

    }
    
}
