class Solution {
    public int search(int[] nums, int target) {
        //if the left is less and right is less , then left is the continous patter 
        //if the left is less and right is high , the  the complete set is continuous pattern
        //if left is high nad right is less ist our smallest integer
        //if left is high and right is high , right is continous pattern 

        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]>nums[left]){
                if(nums[mid]>nums[right]){
                    if(target<nums[mid]&&target>=nums[left])right=mid-1;
                    else left=mid+1;
                }
                else{
                    if(nums[mid]>target)right=mid-1;
                    else left=mid+1;
                }

            }
            else{
                if(nums[mid]>nums[right]){
                    if(target>nums[right])right=mid-1;
                    else left=mid+1;
                }
                else{
                    if(target>nums[mid]&&target<=nums[right])left=mid+1;
                    else right=mid-1;
                }

            }
        }
        return -1;
    }
}
