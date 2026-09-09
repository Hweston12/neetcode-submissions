class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] != val){
                nums[k++] = nums[r];
            }
        }
        return k; 
    }
}