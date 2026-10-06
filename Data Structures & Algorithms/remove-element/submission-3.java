class Solution {
    public int removeElement(int[] nums, int val) {
        
        //dois ponteiros, um que aponta para o inicio do array e avança só quando encontrar o valor do val
        //segundo ponteiro que aponta para o inicio do array e incrementar
        // devolver o primeiro ponterio pq ele conta quantos tivemos

        int valPointer = 0;

        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            if(value != val){
                nums[(valPointer)] = nums[i];
                valPointer++;
            }
        }

        return valPointer;
    }
}