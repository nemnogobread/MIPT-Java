class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int pos1 = 0;
        int pos2 = 0;

        flag: for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    pos1 = i;
                    pos2 = j;
                    break flag;
                }
            }
        }
        int[] res = {pos1, pos2};
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int[] res = Solution.twoSum(input, 9);
        System.out.println(res.toString());
    }
}