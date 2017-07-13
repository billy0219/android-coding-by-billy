/**
 * 계산기
 */
public class Calculator {
    double a;
    double b;

    public Calculator  ( double a, double b ) {
        this.a = a;
        this.b = b;
    }
        public double sum() { return a + b; }
        public double multiply() { return a * b; }
        public double substract() { return a - b; }
        public double divide() { return a / b; }
}
