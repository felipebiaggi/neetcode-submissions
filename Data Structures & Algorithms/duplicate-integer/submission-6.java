class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, String> hash = new HashMap<>(); 
        int size = nums.length;

        for(int value: nums){
            hash.put(value, "number");
        }

        if (size == hash.size()){
            return false;
        }

        return true;
    }
}