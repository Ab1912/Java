public class jagged_array2 {
    public static void main(String[] args) {
        int a[][] = {
            {10,20,30,40},
            {50,60,10},
            {55,25,73,88,99}
        };
        for (int k[] : a) {
            for (int l : k) {
                System.out.print(l+" ");
            }
            System.out.println("");
        }
    }
}
