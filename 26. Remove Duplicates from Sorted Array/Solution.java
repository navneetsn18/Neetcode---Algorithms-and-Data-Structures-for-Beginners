// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// 
// 26. Remove Duplicates from Sorted Array


class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i=n-1;i>0;i--){
            if(nums[i]==nums[i-1]){
                for(int j=i;j<n-1;j++){
                    nums[j]=nums[j+1];
                }
                res++;
            }
        }
        return n-res;
    }
}