package sovos.calculadora.main;

import sovos.calculadora.main.soma.Soma;

public class Calculadora {

    public static void main(String[] args){

        Soma somatoria = new Soma();
        somatoria.setV1(50);
        somatoria.setV2(75);
        somatoria.somarValores();
        System.out.println("resultado da soma: "+ somatoria.getRes());

    }

}
