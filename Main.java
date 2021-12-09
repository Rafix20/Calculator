public class Main {
    int a,b;

    public Main(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Main(int a) {
        this.a = a;
    }
    //dodawanie
    public int add() {
        return a + b;
    }
    //odejmowanie
    public int sub() {
        return a - b;
    }
    //mnożenie
    public int multi() {
        return a * b;
    }
    //dzielenie
    public int div() {
        return a / b;
    }
    //do potęgi
    public double power(){
        return Math.pow(a,b);
    }
    //z pierwiastka kwadratowego
    public double square(){
        return Math.sqrt(a);
    }

}
