import java.util.*;

public class concatnation {
    public static int[] getConcatenation(int nums[]) {
        int n = nums.length;
        int arr[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        return arr;
    }

    public static void main(String args[]) {
        concatnation c1 = new concatnation();
        int arr[] = {1, 2, 3};
        int result[] = c1.getConcatenation(arr);
        System.out.println(Arrays.toString(result));
    }
}
