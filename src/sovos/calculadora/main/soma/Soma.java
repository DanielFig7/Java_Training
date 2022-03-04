package sovos.calculadora.main.soma;

public class Soma {

    private int v1, v2, res;

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void somarValores(){
        setRes(getV1() + getV2());
    }



}
