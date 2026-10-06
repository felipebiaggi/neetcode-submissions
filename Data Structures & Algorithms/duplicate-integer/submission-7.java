class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        //preciso de um hash map ou pelo menos um set;
        //gravo os numero no hash map e depois comparo se o hashmap é menos que o tamanho do array.

        Set<Integer> numsSet = new HashSet<>();
        

        for(int value: nums){
            numsSet.add(value);
        }

        return numsSet.size() != nums.length;

    }
}