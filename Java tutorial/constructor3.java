class complex {
    int real,img;
    public complex () {
        this.real = 5;
        this.img = 2;
    }
    public complex (int r, int i) {
        this.real = r;
        this.img = i;
    }
    public complex (complex obj1) {// copy constructor
        this.real = obj1.real;
        this.img = obj1.img;
    }
    public String toString() {
        return "(" + real + "+" + img + "i)"; 
    }
}

public class constructor3 {
    public static void main(String[] args) {
        complex obj = new complex();
        System.out.println("Object1 : "+obj);

        complex obj1 = new complex(3,7);
        System.out.println("Object2 : "+obj1);

        complex obj2 = new complex(obj1);
        System.out.println("Object3 : "+obj2);
    }
}
