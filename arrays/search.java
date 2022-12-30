package arrays;
//q 704
public class search {
    public int search(int[] nums, int target) {
        int hi = nums.length - 1;
        int lo = 0;
        int mid;
        
        while(hi  - lo > 1){
            mid = (hi - lo)/2 + lo;
            if(target < nums[mid]){
                hi = mid;
            }
            else if(target > nums[mid]){
                lo = mid;
            }else{
                return mid;
            }
        }
        if(nums[lo] == target){
            return lo;
        }
        else if(nums[hi] == target){
            return hi;
        }
        return -1;
    }
}
