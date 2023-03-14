class methods {
    //no return without argument
    public void add() {
        int a = 123;
        int b = 250;
        System.out.println("Addition : "+(a+b));
    }
    //no return with argument
    public void sub(int x,int y) {
        System.out.println("Subtraction : "+(x-y));
    }
    //return without argument
    public int mul() {
        int a = 25;
        int b = 3;
        return a*b;
    }
    //return with argument
    public float div(float x,float y) {
        return x/y;
    }
    //recursion function
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return (n*factorial(n-1));
        }        
    }
}

public class functions {
    public static void main(String[] args) {
        methods obj = new methods();
        obj.add();
        obj.sub(25,15);
        int c = obj.mul();
        System.out.println("Multiplication : "+c);
        float d = obj.div(23,12);
        System.out.println("Division : "+d);
        System.out.println("Factorial : "+obj.factorial(5));
    }
}