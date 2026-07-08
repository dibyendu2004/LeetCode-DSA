class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        int n = nums.length;
        ans[0] = findFirstPosition(nums,target,n);
        ans[1] = findLastPosition(nums,target,n);
        
        return ans;
    }

    public int findFirstPosition(int[] nums,int target,int n){
        int left = 0;
        int right = n - 1;
        int ans = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                ans = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }

    public int findLastPosition(int[] nums,int target,int n){
        int left = 0;
        int right = n - 1;
        int ans = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                ans = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
}