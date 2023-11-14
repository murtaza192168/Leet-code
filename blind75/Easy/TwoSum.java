class TwoSum{
  public static void main(String[] args){
    //Give user input here
    
    // call the method 
    int[] result = twoSum(arr); 
  }
}
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
          /*One pass Hash table approach*/
       /*   TC = O(N) & SC(n) the SC depends on the no.of items stored in the hash table, which stores at most n elements*/
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i <= nums.length - 1; i++)
        {   int curr = nums[i];
            // x + curr = target
            // x = target - curr
            int x = target - curr;
            if(map.containsKey(x))
            {
                return new int[]{map.get(x),i};
            }
            // for thr track that this would be now the updated values to be evaluated
            map.put(curr,i);
        }
        return null;

        /************************************************/
    //     // Brute Force Approach//
    //    for(int i = 0; i < nums.length; i++)//for iterating values of numsarr
    //    {
    //        for(int j = i+1; j < nums.length; j++)//for comparing with nums[i] and adding to get result and take final decsion
    //        {
    //            if(target == nums[i] + nums[j])
    //            {
    //                return new int[]{i, j};
    //            }

    //        }
           
    //    } 
    //    return null; // to satisfy the compiler
        

    }

}
