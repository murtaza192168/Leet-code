class Solution_14 {
    public static void main(String[] args){
        // Give user input here

        // Invoke th method for the result
        String longestPrefix = longestCommonPrefix(str_arr);
        //Display the output
    }
    public String longestCommonPrefix(String[] str_list) {
        // Base condition: if string length is zero, then there is no use of solving the problem
        if(str_list.length == 0){return "";}

        String prefix = str_list[0]; //Initially allocating an element from the list of array as a Prefix (the most eligible one, so that it can be compared)
        for(int i=1; i<str_list.length; i++){// we will start from index_1 bcz first element is already the prefix
            while(str_list[i].indexOf(prefix) != 0){ // When we need to compare and match the prefixes of the array elements of strings, we make use of this inbuilt method
                prefix = prefix.substring(0, prefix.length()-1);
                // when a particular element doesnt have the prefix, then the initial prefix is updated by eleminating its last charachter everytime.
                // For-loop is used so that each and every element of the array gets compared to get desired result
            }
        }
        return prefix;
    }
}
