class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        

        //Temos um array e temos que comparar quando 1 temos
        //devemos contar 1 e validar se a contagem atual é maior que a contagem geral
        int count = 0;
        int maxCount = 0;
        int targetValue = 1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == targetValue){
                count++;

                if(count >= maxCount){
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}