import java.util.Scanner;

//Program to convert string to capitialized
public class string_functions4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String inp = in.nextLine(); 
        StringBuilder a = new StringBuilder(inp);
        System.out.println("Orginal String : "+a);
        
        if (a.charAt(0) >= 97 && a.charAt(0) <= 122) {
            int c = (int)a.charAt(0)-32;
            a.setCharAt(0, (char)c);
        }
        
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == 32) {
                i++;
                int b = (int)a.charAt(i)-32;
                a.setCharAt(i, (char)b);
            }
            else {
                if (a.charAt(i) >=65 && a.charAt(i) <=90) {
                    int b = (int)a.charAt(i)+32;
                    a.setCharAt(i, (char)b);
                }
            }
        }
        System.out.println("Capitialize \n"+a);
        in.close();
    }
}
