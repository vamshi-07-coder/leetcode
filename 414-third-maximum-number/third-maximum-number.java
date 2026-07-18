class Solution {
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length <= 1) return arr;
        
        // 1. Array must be sorted to group duplicates together
        Arrays.sort(arr); 
        
        // 2. Use two pointers to shift unique entries forward
        int j = 0; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        
        // 3. Truncate the leftover elements
        return Arrays.copyOf(arr, j + 1);
    }
    public int thirdMax(int[] nums) {
    int[] unqnums = removeDuplicates(nums);
        Arrays.sort(unqnums);
        if(unqnums.length<3){
            return nums[unqnums.length-1];
        }else{
           return nums[unqnums.length-3];
        }
    }
}