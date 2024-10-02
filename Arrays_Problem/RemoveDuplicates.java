import java.util.HashSet;

public class RemoveDuplicates {

    // method to find duplicates and remove them
    public boolean isDuplicatedArrayEle(int[] nums_arr){
        // initialize an empty Set using HashSet Data structure
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums_arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        // create object call default constructor
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] nums_arr = new int[] {1,2,3};
        boolean result = obj.isDuplicatedArrayEle(nums_arr);
        System.out.println(result);
    }

}
