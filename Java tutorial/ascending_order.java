import java.util.Arrays;

public class ascending_order {
    public static void main(String[] args) {
         //int [] a = new int[] {45,23,15,36,56,35,96,12};
         int a[] = {45,62,142,21,32,65,936,2,36}; 
        System.out.println("Values : "+Arrays.toString(a));

        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending order : "+Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Descending order : "+Arrays.toString(a));
    }   
}
