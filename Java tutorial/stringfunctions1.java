// Program to Reverse a String

public class stringfunctions1 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Abishek learning java program");
        System.out.println(a);
        StringBuilder b = new StringBuilder();

        for (int i = a.length()-1; i >= 0; i--) {
            b.append(a.charAt(i));
        }

        System.out.println("Reverse \n"+b);
    }
}