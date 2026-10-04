class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true;

        String phrase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = phrase.length();

        if(n <= 1){
            return result;
        }

        int left = 0;
        int right = n-1;

        while(left < right){
            if(phrase.charAt(left) != phrase.charAt(right)){
                result = false;
                return result;
            }
            left++;
            right--;
        }
        return result;
    }
}
