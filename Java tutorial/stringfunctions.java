//Program to Count Uppercase,Lowercase,Space,Number,Vowels and Symbols in a String

public class stringfunctions {
    public static void main(String[] args) {
        
        StringBuilder ab =  new StringBuilder("ABI Age is 36@# Java Tutorial 12$");
        int lower = 0, upper = 0, space = 0, number = 0, vowel = 0;

        System.out.println("AB : "+ab);
        for (int i = 0; i < ab.length(); i++) {
            if (ab.charAt(i) >= 97 && ab.charAt(i) <= 122) {
                lower++;
            }
            if (ab.charAt(i) >= 65 && ab.charAt(i) <= 90) {
                upper++;
            }
            if (ab.charAt(i) == 32) {
                space++;
            }
            if (ab.charAt(i) >= 48 && ab.charAt(i) <= 57) {
                number++;
            }
            if (ab.charAt(i) == 'A' || ab.charAt(i) == 'E' || ab.charAt(i) == 'I' ||
            ab.charAt(i) == 'O' || ab.charAt(i) == 'U' || ab.charAt(i) == 'a' ||
            ab.charAt(i) == 'e' || ab.charAt(i) == 'i' || ab.charAt(i) == 'o' ||
             ab.charAt(i) == 'u') {
                vowel++;
            }
        }
        System.out.println("Lower : "+lower);
        System.out.println("Upper : "+upper);
        System.out.println("Space : "+space);
        System.out.println("Number : "+number);
        System.out.println("Vowel : "+vowel);
        System.out.println("Symbols : "+(ab.length()-(lower+upper+space+number)));
    }
}
