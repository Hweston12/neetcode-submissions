class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>(); 
        List<Integer> res = new ArrayList<>(); 

        for(int n: nums1){
            seen.add(n);
        }

        for(int num: nums2){
            if(seen.contains(num)){
                res.add(num);
                seen.remove(num);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}