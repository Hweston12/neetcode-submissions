class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int idx = nums.length - 1;
        int r = idx; 
        int l = 0;
        while(l <= r){
            if(nums[l] * nums[l] > nums[r] * nums[r]){
                res[idx--] = nums[l] * nums[l];
                l++;
            }else{
                res[idx--] = nums[r] * nums[r];
                r--; 
            }
        }
        return res; 
    }
}