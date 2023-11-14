class Median{
  public static void main(String[] args){
    //give user input here

    // Call method
    double[] result = findMedianSortedArrays(arr1, arr2);
    //Print the result here
  }
}

class Solution {
    // USING MERGE SORT ALGORITHM: TC = log(m + n) = log(size)
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // first merge both sorted arrays by declaring size of new container arr as well as new arr declaration
        int total_size = nums1.length + nums2.length;
        // initialize new arr container to store combined arr elements
        int[] mergedArr = new int[total_size];
        // initialze and declare pointers for all three arrays
        int i = 0; // for nums1 arr
        int j = 0; // for nums2 arr
        int k = 0; // for merged arr

        // inorder to check whether  i and j pointers lies in their boundary
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] < nums2[j]) // if nums1 array element is smaller, it will be added in the merged arr as we need merged arr in a sorted order 
            {
                mergedArr[k] = nums1[i];
                i++;
            }
            else // else nums2 arr element will be inserted in merged array
            {
                mergedArr[k] = nums2[j];
                j++;
            }
            k++;
        }    
            // check if any one array (either nums1 or nums2 array) is remaining with the elements still present in their respective arr

            // Common sense: Any one while loop will get executed...
            while(i < nums1.length)
            {
               mergedArr[k] = nums1[i];
               i++;
               k++;
            }
            while(j < nums2.length)
            {
                mergedArr[k] = nums2[j];
                j++;
                k++;
            }

            // Now lets find the median from the combined array
            // Step 1] Check if the length of new array is even or odd
            if(total_size % 2 != 0) // if length is odd > return the middle element      
             {
                 return(mergedArr[total_size / 2]);
             }
             // even > take an average of two elements such that its left and right values are both equal
             return ((mergedArr[(total_size / 2)] + mergedArr[(total_size / 2) - 1]) / 2.0) ;            
        
        
    } 
    
}
