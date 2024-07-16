import java.util.Arrays;

class concatnation{
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example input
        int[] nums = {1, 2, 3};
        
        // Get the concatenated array
        int[] result = solution.getConcatenation(nums);
        
        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
