class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> mapS = new HashMap<>();
        Map<String, Integer> mapT = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for (char value : s.toCharArray()) {
            String newString = String.valueOf(value);
            mapS.put(newString, (mapS.getOrDefault(newString, 0) + 1));
        }

        for (char value : t.toCharArray()) {
            String newString = String.valueOf(value);
            mapT.put(newString, (mapT.getOrDefault(newString, 0) + 1));
        }

        return mapS.equals(mapT);
    }
}
