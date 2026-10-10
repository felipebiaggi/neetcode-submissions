class Solution {
    public int majorityElement(int[] nums) {

        int size = nums.length;
        HashMap<Integer, Integer> maps = new HashMap<>();

        for(int i = 0; i < size; i++){
            maps.put(nums[i], (maps.getOrDefault(nums[i], 0) + 1));
        }

        for(Map.Entry<Integer, Integer> entry: maps.entrySet()){
            if(entry.getValue() > (size / 2)){
                return entry.getKey();
            }
        }

        return 0;
    }
}