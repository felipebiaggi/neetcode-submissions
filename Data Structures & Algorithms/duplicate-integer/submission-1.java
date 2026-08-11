class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        int numsLength = nums.length;

        for(int i = 0; i < numsLength; i++){
            setNums.add(nums[i]);
        }

        if(numsLength == setNums.size()){
            return false;
        }

        return true;
    }
}