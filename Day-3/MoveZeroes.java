public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int k = j; k < nums.length; k++) {
            nums[k] = 0;
        }
    }
    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
