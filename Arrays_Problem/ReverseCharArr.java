import java.util.Arrays;

public class ReverseCharArr {

    public static void reverseCharArr(char[] arr){
        int left = 0, right = arr.length-1;
        while(left < right){
            swapArr(arr, left, right);
            left++;
            right--;
            
        }


    }
    // swap funcion
    public static void swapArr(char[] arr,int s, int e){
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'h','e','l','l','o'};
        // invoke method to display result
        ReverseCharArr.reverseCharArr(arr);
        System.out.println(Arrays.toString(arr));
//        for(char ch: arr){
//            System.out.print(ch+" ");
//        }
    }
}
