// Program to change string case
public class string_functions5 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("The cOMputer Education");
        System.out.println("Orginal string : "+a);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                int b = (int)a.charAt(i)-32;
                a.setCharAt(i, (char)b);
            }
            else if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                int b = (int)a.charAt(i)+32;
                a.setCharAt(i, (char)b);
            }
        }
        System.out.println("Toggle string : "+a);
    }
}
