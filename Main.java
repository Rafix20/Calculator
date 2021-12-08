public class Main {
    int a,b;

    public Main(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Main(int a) {
        this.a = a;
    }

    public int add() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }

    public int multi() {
        return a * b;
    }

    public int div() {
        return a / b;
    }

    public double power(){
        return Math.pow(a,b);
    }

    public double square(){
        return Math.sqrt(a);
    }

}
