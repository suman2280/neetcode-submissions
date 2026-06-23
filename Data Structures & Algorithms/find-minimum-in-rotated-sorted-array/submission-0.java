class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int start=0,end=nums.length-1;
        while(start<=end){
            if(nums[start]<min){
                min=nums[start];
                break;
            }
            int mid=start+(end-start)/2;
            if(nums[mid]>=nums[start]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return min;
    }
}
