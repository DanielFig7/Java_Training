package sovos.calculadora.main.divisao;

public class Divisao {

    private double v1,v2,res;

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getRes() {
        return res;
    }

    public double setRes(double res) {
        return this.res = res;
    }

    public void divValor(){
        setRes(getV1()/getV2());
    }

    public double divValAtribParam(double v1){
        return setRes(getV1()/v1);
    }

    public double divValParam(double v1, double v2){
        return setRes(v1/v2);
    }
}
