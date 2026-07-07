class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == target) return i;
        // }
        // return -1;

        int n = nums.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == target) return mid;
            if(nums[mid] < target) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }
}