class user1 {
    String name; 
    int age;
    user1(String n, int a) {
        this.name = n;
        this.age = a;
    }
}
class user2 extends user1 {
    String company;
    user2(String n, int a, String c) {
        super(n,a);
        this.company = c;
    }
    void display() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Company : "+company);
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        user2 obj = new user2("Abi",32,"Magus");
        obj.display();
    }
}