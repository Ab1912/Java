class rshape {
    int length, breadth;

    rshape () {
        System.out.println("Constructor called");
        length = 12;
        breadth = 18;
    }
    int print() {
        int area = length * breadth;
        return area;
    }
}

class constructor {
    public static void main(String[] args) {
        rshape obj = new rshape();
        System.out.println("Area of rectangle : "+obj.print());    
    }
}