class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            String sortedStr = sortString(str);
            anagramMap.compute(sortedStr, (key, oldValue) -> {
                if (oldValue == null)
                    return new ArrayList<>(List.of(str));
                oldValue.add(str);
                return oldValue;
            });
        }
        return new ArrayList<>(anagramMap.values());
    }

    String sortString(String input) {
        String[] inputArr = input.split("");
        Arrays.sort(inputArr);
        return String.join("", inputArr);
    }
}
