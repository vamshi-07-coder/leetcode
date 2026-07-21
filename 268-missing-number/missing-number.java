class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int idx=0;
        Arrays.sort(nums);
        Arrays.toString(nums);
        for(int i=1;i<=n;i++){
            if(nums[i-1]!=i) idx=i;
        }
        return idx;
    }
}