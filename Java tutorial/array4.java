//Two dimensional Array
public class array4 {
    public static void main(String[] args) {
        int a[][] = {
            {10,20,30},
            {40,50,60},
            {70,80,90}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");    
        }
        int [][]b = new int[10][10];
        b[0][0] = 10;
        System.out.println(b[0][0]);
    }
}
