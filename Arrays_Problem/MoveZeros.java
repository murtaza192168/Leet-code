import java.util.Arrays;

public class MoveZeros {

    // method to move zeros and produce the output without using an extra space i.e. a temporary array. (It should be solved at inplace)
    public static void moveZeros(int[] arr_nums){
        // arr_nums = [2,0,4,5,6,0,0,9];
        //  USING TWO POINTER APPROACH: one pointer for normal loop iteration where in we will place nonZero elements, one ponter for placing the zeros at the end of the array
        // pointing index as first element of array as well as nonZerIndex as first element
        int nonZeroIndex = 0;
        for(int index = 0; index <= arr_nums.length-1; index++){
            if(arr_nums[index] != 0){
                arr_nums[nonZeroIndex] = arr_nums[index];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i<=arr_nums.length-1; i++){
            arr_nums[i] = 0;
        }

    }

    public static void main(String[] args) {
        // default constructor is already called and object is created
        // Calling methos using class name, bcz static members on the class instead of a object
        int[] nums_arr = new int[]{2,0,3,0,3,9,0};
        MoveZeros.moveZeros(nums_arr);
        System.out.println(Arrays.toString(nums_arr));

        // print modified arr to produce the result using loop: Using Enhanced ForLoop
//        for(int num: nums_arr){
//            System.out.print(num+" ");
//        }
    }
}
