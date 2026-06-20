class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            hashMap.putIfAbsent(key, new ArrayList<>());
            hashMap.get(key).add(s);
        }

        return new ArrayList<>(hashMap.values());
    }
}
