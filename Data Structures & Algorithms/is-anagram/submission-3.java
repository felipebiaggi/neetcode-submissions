class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(char value: s.toCharArray()){
            mapS.put(value, (mapS.getOrDefault(value, 0) + 1));
        }

        for(char value: t.toCharArray()){
            mapT.put(value, (mapT.getOrDefault(value, 0) + 1));
        }


        return mapS.equals(mapT);
    }
}
