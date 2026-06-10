class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int res = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            if(seen.containsKey(s.charAt(r))){
                l = Math.max(l, seen.get(s.charAt(r)) + 1); 
            }
            seen.put(s.charAt(r), r); 
            res = Math.max(res, r - l + 1); 
        }
        return res; 
    }
}
