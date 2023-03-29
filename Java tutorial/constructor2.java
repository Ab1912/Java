//parameterized constructor
class box {
    int length, breadth;
    public box () {// default constructor
        length = 7;
        breadth = 13;
    }
    public box (int x, int y) {// parameterized constructor
        length = x;
        breadth = y;
    }
    public box (int x) {
        length = breadth = x;
    }
    int area () {
        int a = length * breadth;
        return a;
    }
}

public class constructor2 {
    public static void main(String[] args) {
        box obj = new box();
        System.out.println("Area of Rectangle1 : "+obj.area());

        box obj1 = new box(4,7);
        System.out.println("Area of Rectangle2 : "+obj1.area());

        box obj2 = new box(5);
        System.out.println("Area of Rectangle2 : "+obj2.area());
    }
}
