class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>(); 

        for(int num: nums1){
            seen.add(num);
        }

        for(int nums: nums2){
            if(seen.contains(nums)){
                res.add(nums);
                seen.remove(nums);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray(); 
    }
}