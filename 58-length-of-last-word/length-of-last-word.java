class Solution {
    public int lengthOfLastWord(String s) {
        String[] v=s.split(" ");
        return v[v.length-1].length();        
    }
}