class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int[] pref = new int[size];
        int[] suff = new int[size];

        pref[0] = 1;
        suff[size -1] = 1;

        for(int i = 1; i < size; i++){
            pref[i] = pref[i - 1] * nums[i - 1];
        }

        for(int i = (size - 2); i >= 0; i--){
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < size; i++){
            result[i] = pref[i] * suff[i];
        }

        return result;
    }
}  
