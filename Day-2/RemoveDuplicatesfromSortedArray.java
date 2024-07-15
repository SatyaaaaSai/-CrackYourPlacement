public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray obj=new RemoveDuplicatesfromSortedArray();
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int n=obj.removeDuplicates(nums);
        System.out.println("Array after removing duplicates: ");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }   
}
