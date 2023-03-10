public class ascii {
    public static void main(String[] args) {
        /*  65-90  A-Z
            97-122 a-z
            48-57  0-9
            Space  32 */
        for (int i = 0; i <= 255; i++) {
            System.out.println(i+" : "+(char)i);
        }
    }
}
