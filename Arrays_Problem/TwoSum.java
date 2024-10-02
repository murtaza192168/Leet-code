import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        // create object and invoke method
        TwoSum ts = new TwoSum();
        int[] arr = {1,2,3,4,5,6};
        int[] result = TwoSum.findTwoSum(arr,10);
        System.out.println(result[0]+" , "+ result[1]);



    }
    // Using BRUTE FORCE ALGORITHM
/*
*  Array of numbers from which any two numbers sum should be equal to the target. Indices of those two numbers need to be returned as a result
*  Return not more than one solution
* */
    public static int[] findTwoSum(int[] nums ,int target){
        // Using BRUTE FORCE ALGORITHM
//        for(int i=0; i<=nums.length - 1; i++){ // outer loop for pass
//            for(int j=i+1; j<=nums.length-1; j++){ // inner loop for comaparing each element with one another
//                // T.C. = O(N^2)
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i,j};
//                }
//
//            }
//        }
//        return null;

            // USING HASH-MAP : Optimised solution with O(N) T.C.
        // Initialize an empty Hash Map to store values, keys
        Map<Integer, Integer> hashmap = new HashMap<>(); // an empty hashmap
        for(int i = 0; i <= nums.length-1; i++){
            // initialize a new reference var as x: for storing target - nums[i] for each element
            int x = target - nums[i];
            if(hashmap.containsKey(x)){
                return new int[]{hashmap.get(x),i};
            }
            hashmap.put(nums[i], i);
        }
        return null;
    }
}


