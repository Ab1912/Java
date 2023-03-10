import java.util.Scanner;

public class getting_input
{
public static void main(String[] args) 
{
    Scanner obj = new Scanner(System.in);
    int a,b,c;
    a = obj.nextInt();
    b = obj.nextInt();
    c = (a*a) + (b*b) + (2*(a*b));
    System.out.println("Result : " + c);
    obj.close();
}
}