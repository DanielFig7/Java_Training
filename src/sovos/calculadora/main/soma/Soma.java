package sovos.calculadora.main.soma;

public class Soma {

    private double v1, v2, res;

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

    public void setRes(double res) {
        this.res = res;
    }

    public void somarValores(){
        setRes(getV1() + getV2());
    }

}
