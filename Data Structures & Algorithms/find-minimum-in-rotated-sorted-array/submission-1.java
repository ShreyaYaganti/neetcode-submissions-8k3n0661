class Solution {
    public int findMin(int[] nums) {
        int l, r, mid;
        l = 0;
        r = nums.length-1;
        int n = nums.length;
        while (l < r) {
            mid = (l + r)/2;
            int ml, mr;
            ml = ((mid - 1 + n)%n);
            mr = ((mid + 1 + n)%n);
            if (nums[mid]< nums[ml] && nums[mid]< nums[mr]){
                return nums[mid];
            }
            if (nums[mid]>nums[r]){
                l = mid +1;
            }
            else {
                r = mid - 1;
            }
            System.out.println(l + " " + r + " " + mid);
        }
        return nums[l];
    }
}
