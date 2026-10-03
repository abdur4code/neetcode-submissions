class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int n = nums.length;

        int max = 1;

        if(n <= 1){
            return n;
        } 

        for(int num: nums){
            seen.add(num);
        }

        for(int num: seen){
            if(seen.contains(num-1)) continue;

            int start = num;
            int count = 1;

            while(seen.contains(start+1)){
                start++;
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
