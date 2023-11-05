public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 7, 9, 10};
        int target = 7;
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
        System.out.println("[" + pos1 + ", " + pos2 + "]");
    }
}