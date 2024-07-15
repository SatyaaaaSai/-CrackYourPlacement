class Solution {
    public void sortColors(int[] nums) {
        //DNF Algorithm..
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp=0;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            } else if(nums[mid]==1){
                mid++;
            } else {
                temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }      
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        s.sortColors(nums);
        for(int num: nums) {
            System.out.print(num + " ");
        }
    }
}