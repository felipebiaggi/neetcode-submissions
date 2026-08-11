class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int first = 1;
        int count = 0;
        int max = 0;

        for (int value : nums) {
            if(value == first){
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}