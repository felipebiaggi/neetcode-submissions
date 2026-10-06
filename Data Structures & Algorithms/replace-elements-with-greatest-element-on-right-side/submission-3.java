class Solution {
    public int[] replaceElements(int[] arr) {
        
        int maxSoFar = -1;
        int size = arr.length;

        for(int i = (size - 1); i >= 0; i--){

            int value = arr[i];
            arr[i] = maxSoFar;
            if(value >= maxSoFar){
                maxSoFar = value;
            }
        }

        return arr;
    }
}