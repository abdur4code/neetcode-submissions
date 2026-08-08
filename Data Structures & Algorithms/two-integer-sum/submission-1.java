class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = 0;
        ans[1] = 1;

        for(int i = 0; i < nums.length; i++) {
            int z = target - nums[i];
            if(seen.containsKey(z)) {
                ans[0] = seen.get(z);
                ans[1] = i;
            }
            seen.put(nums[i], i);
        }

        return ans;
    }
}
