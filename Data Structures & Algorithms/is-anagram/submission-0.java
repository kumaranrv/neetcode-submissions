class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0)+1);
            countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i), 0)-1);
        }

        System.out.println(countMap);
            
        return countMap.values().stream().allMatch(v->v==0);
    }
}
