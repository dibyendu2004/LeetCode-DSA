class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        // int low = 0;
        // int high = n-1;
        // while(low<=high){
        //     int mid = (low+high)/2;
        //     if(nums[mid] == target) return mid;
        //     if(target < nums[mid]) high = mid-1;
        //     else low = mid+1;
        // }
        // return -1;
        return binarySearch(nums,0,n-1,target);
    }
    public int binarySearch(int[] nums,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;

        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] < target){
            return binarySearch(nums,mid+1,high,target);
        }
    
        return binarySearch(nums,low,mid-1,target);
        

    }
}