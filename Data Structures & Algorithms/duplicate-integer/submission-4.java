class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> setNums = new HashSet<>();
       int arrayLength = nums.length;

       for(int i = 0; i < arrayLength; i++){
            setNums.add(nums[i]);
       } 

       if(arrayLength == setNums.size()){
        return false;
       }

       return true;
    }
}