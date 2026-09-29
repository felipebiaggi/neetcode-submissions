class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int maxConsecutive = 0;

        for(int value: nums){

            if(value == 1){
                count++;
                maxConsecutive = Math.max(maxConsecutive, count);
            } else {
                count = 0;
            }
        }
        return maxConsecutive;
    }
}