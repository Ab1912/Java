public class methodargs {
    public static void getname(String... name) {
        for (String n : name) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        getname("Abi","Kavi","Deva","Suresh");
    }
}
