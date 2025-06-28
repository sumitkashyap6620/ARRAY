class solution {
    public static int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = -1 ;
        arr[1] = -1 ;
       int mid = (0+arr.length)/2;
        while(mid !=0){
            if(nums[mid] == target){
                arr[0] = mid ;
                if(nums[mid-1] == target)
                arr[1] = mid - 1 ;
                else 
                arr[1] = mid + 1 ; 
                return arr ;
            }
            else if(target < nums[mid])
                mid = (0+mid)/2 ;
             else
                mid = (mid+nums.length)/2 ;
            } 
        
        return arr ;
    }
    public static void main(String[] args) {
       int nums[] = {1,2,4,4,5};
       int arr[] = new int[2];
       arr = searchRange(nums,4);
       System.out.println(arr);
}
}
