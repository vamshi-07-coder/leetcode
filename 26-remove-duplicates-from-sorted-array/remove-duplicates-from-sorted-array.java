class Solution {
    public int removeDuplicates(int[] nums) {
       int uniquecount=0;
       for(int i=1;i<nums.length;i++){
        if(nums[uniquecount]!=nums[i]){

            uniquecount++;
            nums[uniquecount]=nums[i];
       }
       }
       return uniquecount+1;

    }


}