class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> mapResult = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int result = target - nums[i];
            mapResult.put(result, i);
        }
        

        for(int i = 0; i < nums.length; i++){
            int value = nums[i];

            Integer resultIndex = mapResult.get(value);

            if(resultIndex != null){

            if (i != resultIndex){
                return new int[]{i, resultIndex};
                }   
            }
        }



        return new int[]{};
    }
}
