class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> count = new HashSet<>();
        int res = 0; 

        for(int n: nums){
            count.add(n);
        }

        for(int num: count){
            if(!count.contains(num - 1)){
                int length = 1;
                while(count.contains(num + length)){
                    length++;
                }
                res = Math.max(res, length); 
            }
        }
        return res; 
    }
}
