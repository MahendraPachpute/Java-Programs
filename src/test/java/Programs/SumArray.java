package Programs;

public class SumArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int sum = 0;
        for (int value : a) {
            sum = value + sum;
        }
        System.out.println("Sum of array is :: " + sum);
    }
}
