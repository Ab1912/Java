
// Program to find duplicate numbers in an array
public class array3 {
    public static void main(String[] args) {
        int j = 0;
        int a[] = {3,5,8,3,6,5,5,3,9,8,7};
        System.out.println("Duplicate values : ");
        for (int i = 0; i < a.length-1; i++) {
            for ( j = i+1; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                   System.out.print(a[j]+"\t");
                }
            }
        }
    }
}