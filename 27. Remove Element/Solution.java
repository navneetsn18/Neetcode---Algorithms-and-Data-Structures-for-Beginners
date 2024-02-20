// https://leetcode.com/problems/remove-element/description/
// 
// 27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]==val){
                int temp = i;
                while(temp<n-1){
                    nums[temp] = nums[temp+1];
                    temp++;
                }
                count++;
            }
        }
        return n-count;
    }
}