public class MaxSubArrSum {

    // find maximum sum that is found out from the contagius elements (subarray) from an array
    // KADANE's ALGORITHM
    public static int findMaxSum(int[] nums_arr){
        // declaring the first element initially from the array as the currentSum and maxSum, in order to get further calculated results
        int currentSum = nums_arr[0], maxSum = nums_arr[0];
        for(int i = 1; i<=nums_arr.length-1; i++){
            //Edge Case 1: if all elements in input array are all negative, the result i.e. maxSum = negative integer(smallest sum)

            // update current and keep track of the cureent sum where in we take sum of the elements of the subarray
            currentSum = Math.max(currentSum + nums_arr[i], nums_arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums_arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubArrSum.findMaxSum(nums_arr));
        // Static members are invoked using CLASS NAME since they belongs to the class

    }
}
