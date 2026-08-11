class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> arrayList = new HashSet<>();
        int arrayLen = nums.length;

        for(int i = 0; i < arrayLen; i++){
            arrayList.add(nums[i]);
        }

        if (arrayLen == arrayList.size()){
            return false;
        }

        return true;
    }
}