class demo {
    private int m,n;
    demo (int x, int y) {
        m = x;
        n = y;
    }
    int largest() {
        if (m > n) {
            return m;
        }
        else {
            return n;
        }
    }
    void display() {
        int large = largest();
        System.out.println("Greatest number is : "+large);
    }
}

public class nested_method {
    public static void main(String[] args) {
        demo obj = new demo(34,24);
        obj.display();
    }   
}