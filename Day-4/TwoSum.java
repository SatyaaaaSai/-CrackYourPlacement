import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hmap.containsKey(complement)) {
                res[0] = hmap.get(complement);
                res[1] = i;
                return res;
            }
            hmap.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum m = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = m.twoSum(nums, target);
        System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
    }
    
}
