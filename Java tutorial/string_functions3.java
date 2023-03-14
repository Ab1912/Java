//Program to convert Uppercase to Lowercase
public class string_functions3 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("ABC");
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                int b = a.charAt(i)+32;
                a.setCharAt(i, (char)b);
            }
        }
        System.out.println("Lowercase \n"+a);
    }
}
