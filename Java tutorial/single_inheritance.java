class father { // base class
    public void house() {
        System.out.println("Father owns 2BHK house");
    }
}
class son extends father { // derived class
    public void car() {
        System.out.println("Son owns a audi car");
    }
}

class single_inheritance {
    public static void main(String[] args) {
        son obj = new son();
        obj.car();
        obj.house();
    }
}