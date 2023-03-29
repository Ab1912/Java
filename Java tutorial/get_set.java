// data hiding using getter and setter
class rec {
    private int length,breadth;
    
    //getter method
    int getlength() {
        return length;
    }
    int getbreadth() {
        return breadth;
    }

    //setter method
    void setlength(int x) {
        if (x>0) {
            length = x;
        }
        else {
            length = 0;
        }
    }
    void setbreadth(int y) {
        if (y>0) {
            breadth = y;
        }
        else {
            breadth = 0;
        }
    }

    int area() {
        int area = length*breadth;
        return area;
    }
}

public class get_set {
    public static void main(String[] args) {
        rec obj = new rec();
        obj.setlength(12);
        obj.setbreadth(18);
        System.out.println("Area of Rectangle : "+obj.area());
    }
}
