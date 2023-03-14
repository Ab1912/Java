//Program to convert Lowercase to Uppercase
public class string_functions2 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        System.out.println(a);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 97 && a.charAt(i) <=122) {
                int c = (int)a.charAt(i)-32;
                a.setCharAt(i, (char)c);
            }
        }
        System.out.println(a);       
    }
}
