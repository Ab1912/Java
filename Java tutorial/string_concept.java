public class string_concept {
    public static void main(String[] args) {
        String a = "Abi Tutorial";
        String b = "Abi Tutorial";
        String c = "Abi tutorial";
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        System.out.println("A hashcode : "+a.hashCode());
        System.out.println("B hashcode : "+b.hashCode());
        System.out.println("A equals B : "+a.equals(b));
        System.out.println("A equals B ignore case : "+a.equalsIgnoreCase(b));
        System.out.println("A length : "+a.length());
        System.out.println("A charAt : "+a.charAt(8));
        System.out.println("A upperclass : "+a.toUpperCase());
        System.out.println("A Lowercase : "+a.toLowerCase());
        System.out.println("A replace : "+a.replace("Tutorial","Java" ));
        System.out.println("A contains : "+a.contains("Abi"));
        System.out.println("A is empty : "+a.isEmpty());
        System.out.println("A endwith : "+a.endsWith("al"));
        System.out.println("A startswith : "+a.startsWith("Ab"));
        System.out.println("A equals C ignores case : "+a.equalsIgnoreCase(c));
        System.out.println("A substring : "+a.substring(2));
        System.out.println("A substring : "+a.substring(1,6));

        char[] charray = a.toCharArray();

        for (char d : charray) {
            System.out.print(d+" ");
        }

        String d = " Abi ";
        System.out.println("\nD length : "+d.length());
        System.out.println("D trim : "+d.trim());
    }
}
