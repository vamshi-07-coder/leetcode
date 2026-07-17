class Solution {
    public char findTheDifference(String s, String t) {
        int len=s.length();
        int sum=0,sum2=0;
        for(int i=0;i<len;i++){
            sum+=(int)s.charAt(i);
        }for(int i=0;i<len+1;i++){
            sum2+=(int)t.charAt(i);
        }
        return (char)(sum2-sum);
    }
}