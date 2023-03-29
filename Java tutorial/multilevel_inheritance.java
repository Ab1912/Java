class grandfather {
    public void house() {
        System.out.println("Grandfather owns 3BHK flat");
    }
}
class father1 extends grandfather {
    public void land() {
        System.out.println("Father owns 5 acre land");
    }
}
class son1 extends father1 {
    public void car() {
        System.out.println("Son owns audi car");
    }
}

class multilevel_inheritance {
    public static void main(String[] args) {
        son1 obj = new son1();
        obj.car();
        obj.land();
        obj.house();
    }
}