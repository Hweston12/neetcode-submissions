class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>(); 
        List<Integer> res = new ArrayList<>(); 
        
        for(int num: nums1){
            seen.add(num); 
        }

        for(int n: nums2){
            if(seen.contains(n)){
                res.add(n);
                seen.remove(n);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray(); 
    }
}