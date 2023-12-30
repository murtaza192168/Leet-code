class Solution_15 {
    public static void main(String[] args){
        //Give user Input as an Array
        // Call the method for execution
        //Print the result
    }

    // Create a result MultiDimen ArrayList to store the Triplet combinations
    List<List<Integer>> result = new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        // Multidimensional ArrayList (Where List is the Interface)

    //3Sum = 3sum logic + 2sumSorted Algo as a helper logic
    // We need to sort this array first. Sorted Array will make you traversal through the array in sequence
    Arrays.sort(nums); // Sorted! . Array is a class with inbuilt method as sort().
        // Since for the very first element of the array will be traversed till the 3rd last position of the list bcz here we are dealing with triplets
        for(int i=0; i<nums.length-2; i++){
            // a+b+c = 0 and b+c=0-a
            // For a
            // Handle duplicate for a
            if(i==0 || nums[i-1]!=nums[i]){
                //invoke the method of twoSumSorted
            twoSumSorted(nums,i+1,nums.length-1,0-nums[i]);
            }
        }
        return result;
    }

    // Two Sum Sorted Method. This method will be invoked in the above method of threeSum
  //public void twoSumSorted(nums_arr,start_index(search_space_start),end_index(search_space_end),0-a(b+c = target))
    public void twoSumSorted(int[] nums,int i,int j, int target){
       
       int a = nums[i-1];
       while(i < j){
           // cond.1) if the target is more than b+c, then move the largest element backwards: j-- so that you can go near to the required target bcz we are using two-point algorithm
           if(nums[i]+nums[j] > target)
           {j--;}
           else if(nums[i]+nums[j] < target){i++;}
           else{
               // Create a new Arraylist
               List<Integer> list = new ArrayList();
               list.add(a);
               list.add(nums[i]);
               list.add(nums[j]);
               result.add(list);

               // Handle nums[i]:b duplicates
               while(i<j && nums[i]==nums[i+1]){i++;}
               // Handle nums[j]:c duplicates
               while(i<j && nums[j]==nums[j-1]){j--;} 

               i++;
               j--;
           }

       }
    } 

}
