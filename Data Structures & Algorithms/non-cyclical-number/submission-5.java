class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(!seen.contains(n)){
            seen.add(n);
            n = sumOfSquares(n); 
            if(n == 1){
                return true; 
            }
        }
        return false; 
    }
}

private Integer sumOfSquares(int n){
    int output = 0; 
    while(n > 0){
        int digit = n % 10; 
        digit = digit * digit; 
        output += digit;
        n /= 10; 
    }
    return output; 
}