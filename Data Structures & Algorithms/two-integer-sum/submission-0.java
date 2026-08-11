class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if(hMap.containsKey(diff)){
                return new int[] {hMap.get(diff), i};
            }

            hMap.put(num, i);
        }

        return new int[] {};
    }
}
