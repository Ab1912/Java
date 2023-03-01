import java.util.Scanner;

public class group_switch {
    public static void main(String[] args) {
        char vow;
        System.out.print("Enter a Vowel : ");
        Scanner in = new Scanner(System.in);
        vow = in.next().charAt(0);
        switch (vow) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(vow + " is a vowel");
                break;
            default:
                System.out.println(vow + " is not a vowel");
                break;
        }

        in.close();
    }
}