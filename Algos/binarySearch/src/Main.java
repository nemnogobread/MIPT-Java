import java.util.Arrays;

public class Main {
    public static int binarySearch(int[] nums, int target){
        int middle = nums.length / 2;
        if (nums[middle] == target){
            return middle;
        } else if (nums[middle] < target) {
            int[] copy = new int[nums.length - middle - 1];
            System.arraycopy(nums, middle + 1, copy, 0, nums.length - middle - 1);
            return binarySearch(copy, target) + middle + 1;
        } else {
            int[] copy = new int[middle];
            System.arraycopy(nums, 0, copy, 0, middle);
            return binarySearch(copy, target);
        }
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{0, 1, 2, 3, 4, 5}, 3));
    }
}