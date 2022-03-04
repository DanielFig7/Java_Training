package sovos.calculadora.main;

import sovos.calculadora.main.divisao.Divisao;
import sovos.calculadora.main.multiplicacao.Multiplicacao;
import sovos.calculadora.main.soma.Soma;
import sovos.calculadora.main.subtracao.Subtracao;

public class Calculadora {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Calculadora calculadora = new Calculadora();

        soma.setV1(10);
        soma.setV2(5);
        soma.somarValores();
        System.out.println(soma.getRes());

        System.out.println("Resultado da divisão por Atributo: " + calculadora.getDividirAtributo(50,2));
        System.out.println("Resultado da divisão por Parametro: " + calculadora.getDividirParametro(70,2));
        System.out.println("Resultado da divisão por Atributo e Parametro: " + calculadora.getDividirAtribParam(150,3));

        System.out.println("Resultado da multiplicação por Atributo: " + calculadora.getMultAtributo(50,2));
        System.out.println("Resultado da multiplicação por Parametro: " + calculadora.getMultParametro(70,2));
        System.out.println("Resultado da multiplicação por Atributo e Parametro: " + calculadora.getMultAtribParam(150,3));

        System.out.println("Resultado da subtração por Atributo: " + calculadora.getSubAtributo(50,2));
        System.out.println("Resultado da subtração por Parametro: " + calculadora.getSubParametro(70,2));
        System.out.println("Resultado da subtração por Atributo e Parametro: " + calculadora.getSubAtribParam(150,3));

    }

    //DIVIDIR

    private double getDividirAtributo(double v1, double v2) {
        Divisao div = new Divisao();
        div.setV1(v1);
        div.setV2(v2);
        div.divValor();
        return div.getRes();
    }

    private double getDividirParametro(double v1, double v2) {
        Divisao div = new Divisao();
        return div.divValParam(v1,v2);

    }

    private double getDividirAtribParam(double v1, double v2) {
        Divisao div = new Divisao();
        div.setV1(v1);
        return div.divValAtribParam(v2);
    }

    //MULTIPLICAR

    private double getMultAtributo(double v1, double v2) {
        Multiplicacao mult = new Multiplicacao();
        mult.setV1(v1);
        mult.setV2(v2);
        mult.multValor();
        return mult.getRes();
    }

    private double getMultParametro(double v1, double v2) {
        Multiplicacao mult = new Multiplicacao();
        return mult.multValParam(v1,v2);

    }

    private double getMultAtribParam(double v1, double v2) {
        Multiplicacao mult = new Multiplicacao();
        mult.setV1(v1);
        return mult.multValAtribParam(v2);
    }

    //SUBTRAIR

    private double getSubAtributo(double v1, double v2) {
        Subtracao sub = new Subtracao();
        sub.setV1(v1);
        sub.setV2(v2);
        sub.subValor();
        return sub.getRes();
    }

    private double getSubParametro(double v1, double v2) {
        Subtracao sub = new Subtracao();
        return sub.subValParam(v1,v2);

    }

    private double getSubAtribParam(double v1, double v2) {
        Subtracao sub = new Subtracao();
        sub.setV1(v1);
        return sub.subValAtribParam(v2);
    }

}