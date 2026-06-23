class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        int firstSearch=binarySearch(nums,target,0,pivot);
        if(firstSearch!=-1){
            return firstSearch;
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    public int findPivot(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
               start=mid+1;
            }
        }
        return -1;
    }
    public int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
