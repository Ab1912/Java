public class stringbuffer_stringbuilder {
    public static void main(String[] args) {
        StringBuffer buf =new StringBuffer("Tutorial");
        System.out.println(buf);
        buf.append(" Abi");
        System.out.println(buf);
        buf.insert(9, "Java");
        System.out.println(buf);
        buf.replace(5, 10,"learn" );
        System.out.println(buf);
        buf.delete(5, 9);
        System.out.println(buf);
        buf.reverse();
        System.out.println(buf);
        System.out.println(buf.charAt(3));
        System.out.println(buf.length());
        System.out.println(buf.substring(4));
        System.out.println(buf.substring(0,5));
        buf.setCharAt(3, '@');
        System.out.println(buf);

        StringBuffer ab = new StringBuffer();
        System.out.println(ab.capacity());
        ab.append("Hello");
        System.out.println(ab);
        System.out.println(ab.capacity());
        ab.append(" I am learning Java language");
        System.out.println(ab);
        System.out.println(ab.capacity());
    }
}
