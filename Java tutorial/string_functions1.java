// Program to Reverse a String

public class string_functions1 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Abishek tutorial learning java");
        System.out.println("String \n"+a);
        StringBuilder b = new StringBuilder();
        for (int i = a.length()-1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        System.out.println("Reverse String \n"+b);
    }
}
