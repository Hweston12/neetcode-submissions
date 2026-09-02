class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums); 
        int l = 0;
        int res = Integer.MAX_VALUE; 
        int r = k - 1; 
        
        while(r < nums.length){
            res = Math.min(res, nums[r] - nums[l]);
            l++;
            r++;
        }
        return res; 
    }
}