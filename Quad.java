class Quad<T> {
    private final String oper;
    private final String opdo1;
    private final String opdo2;
    private T res;

    public Quad(String oper, String opdo1, String opdo2, T res) {
        this.oper = oper;
        this.opdo1 = opdo1;
        this.opdo2 = opdo2;
        this.res = res;
    }

    public void setRes(T res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return  "( "+ oper + ", " + opdo1 + ", " + opdo2 + ", " + res + ")";
    }

}