class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> seen = new HashMap<>();

        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String identity = new String(ch);
            seen.computeIfAbsent(identity, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(seen.values());
    }
}
