class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsHash = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(numsHash.containsKey(diff)){
                return new int[] {numsHash.get(diff), i};
            }

            numsHash.put(nums[i], i);
        }

        return new int[] {};
    }
}
