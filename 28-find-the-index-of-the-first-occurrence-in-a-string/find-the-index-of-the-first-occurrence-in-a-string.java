class Solution {
    public int strStr(String haystack, String needle) {
        int idx=haystack.indexOf(needle);
        if(idx>=0) return idx;
        else return -1;
    }
}