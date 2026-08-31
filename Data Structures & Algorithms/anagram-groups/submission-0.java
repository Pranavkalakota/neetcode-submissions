class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String sorted = new String(letters); // key
            // returns the key with the values or makes a new one if the key doesn't exist. 
            List<String> group = map.getOrDefault(sorted, new ArrayList<>());
            map.put(sorted, group);
            group.add(strs[i]); // we want to add the original word to the list
        }
        return new ArrayList<>(map.values());
    }
}
