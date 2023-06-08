/*  65-90  A-Z
    97-122 a-z
    48-57  0-9
    Space  32 */
public class Main {
    public static void main(String args[]) {
        for (int i = 65; i <= 90; i++) {
            System.out.print(i+" "+(char)i+"\n");
        }
        for (int i = 97; i <= 122; i++) {
            System.out.print(i+" "+(char)i+"\n");
        }
        for (int i = 48; i <= 57; i++) {
            System.out.print(i+" "+(char)i+"\n");
        }
        for (int i = 32; i <= 32; i++) {
            System.out.print(i+" "+(char)i+"\n");
        }
    }
}