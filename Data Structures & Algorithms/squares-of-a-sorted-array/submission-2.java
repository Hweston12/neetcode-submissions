class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0; 
        int r = nums.length - 1; 
        int[] res = new int[nums.length];
        int idx = r; 

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