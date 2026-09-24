class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] != val){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
        return l; 
    }
}