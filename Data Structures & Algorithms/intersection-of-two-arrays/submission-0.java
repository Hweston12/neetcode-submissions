class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>(); 
        List<Integer> res = new ArrayList<>(); 

        for(int n: nums1){
            seen.add(n);
        }

        for(int i: nums2){
            if(seen.contains(i)){
                res.add(i);
                seen.remove(i);
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}