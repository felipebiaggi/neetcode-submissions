class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length /2;
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int num: nums){
            map.put(num, (map.getOrDefault(num, 0) + 1));
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            int key = e.getKey();
            int value = e.getValue();

            if(value > majority){
                result = key;
            }
        }

        return result;
    }
}