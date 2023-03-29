class rectangle {
    int length, breadth;
    void getdetails(int x, int y) {
        length = x;
        breadth = y;
    }
    int area() {
        int a = length * breadth;
        return a;
    }
}

public class class_object {
    public static void main(String[] args) {
        rectangle obj = new rectangle();
        obj.length = 25;
        obj.breadth = 35;
        System.out.println("Area of a Rectangle : "+obj.area());

        rectangle obj2 = new rectangle();
        obj2.getdetails(25,36);
        System.out.println("Area of Rectangle2 : "+obj2.area());
    }
}