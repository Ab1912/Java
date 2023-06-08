import java.util.Scanner;

class shape1 {
    float length, breadth, radius;
}

class square extends shape1 {
    public square(float l) {
        length = l;
    }

    float square_area() {
        return length * length;
    }
}

class rectangle1 extends shape1 {
    public rectangle1(float l, float b) {
        length = l;
        breadth = b;
    }

    float rectangle_area() {
        return length * breadth;
    }
}

class circle extends shape1 {
    public circle(float r) {
        radius = r;
    }

    float circle_radius() {
        return 3.14f * (radius * radius);
    }
}

public class hierarchial_inheritance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length : ");
        float l = in.nextFloat();
        System.out.print("Enter breadth : ");
        float b = in.nextFloat();
        System.out.print("Enter radius : ");
        float r = in.nextFloat();
        square obj = new square(l);
        rectangle1 obj1 = new rectangle1(l,b);
        circle obj2 = new circle(r);
        System.out.println("Area of a square : " + obj.square_area());
        System.out.println("Area of a rectangle : " + obj1.rectangle_area());
        System.out.println("Area of a circle : " + obj2.circle_radius());
        in.close();
    }
}