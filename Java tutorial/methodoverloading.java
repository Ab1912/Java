class mathoperation {
    static int multiply(int a, int b) {
        return a * b;
    }
    static float multiply(float i, float j) {
        return i * j;
    }
    static float multiply(float x, int y) {
        return x * y;
    }
    static int multiply(int r) {
        return r * r;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        System.out.println("Multiply integer value : "+mathoperation.multiply(12,7));
        System.out.println("Multiply double value : "+mathoperation.multiply(8.25f, 12.45f));
        System.out.println("Multiply int and double : "+mathoperation.multiply(8.52f, 5));
        System.out.println("Multiply single integer : "+mathoperation.multiply(7));
    }   
}
