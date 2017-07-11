/**
 * Why?
 * constructor
 * inheritance
 */
public class Classes {
    int a;
    int b;

    public Classes(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int sum() {
        return a + b;
    }
    public int multiply(){
        return a * b;
    }
}

class SubClasses extends Classes {

    public SubClasses(int a, int b) {
        super(a, b);
    }

    public int sum() {
        return a + b + 100;
    }
    public int substract() {
        return a - b;
    }
    public int divide() {
        return a / b;
    }
}
