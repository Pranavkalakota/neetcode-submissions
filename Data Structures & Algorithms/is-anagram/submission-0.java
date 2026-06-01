class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        for(int i = 0; i < s.length(); i++){
                if(s.length() == t.length() || t.length() == s.length()){
                    if(s.contains(t.substring(i))){
                      result = true;
                    }
                }
                else {
                    return false;
                }
        }
        return result;
    }
}   


