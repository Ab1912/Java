// data hiding using getter and setter

class shape {
    private int length,breadth,area;
    
    //getter method
    int getarea() {
        return area;
    }
      

    //setter method 
    void setarea(int x,int y) {
        length = x;
        breadth = y;
    }

    int area() {
        area = length*breadth;
        return area;
    }
    
}

public class get_set2 {
    public static void main(String[] args) {
        shape obj = new shape();
        obj.setarea(27,39);
        System.out.println("Area of rectangle : "+obj.area());    
    }
}