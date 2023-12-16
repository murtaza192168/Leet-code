class Solution_12 { // 2390: 1000 1000 300 90
// build = "MMCCCXC"
// num = 0
    public static void main (String[] args){
        // Give user Input here

        // Call the method to convert Integer number into Roman numeral
        String result = intToRoman(number);
        // Display the result
    }
    public String intToRoman(int num) { 
        // Method means: I will return you the result in Roman (STRING), for that you need to provide me the integer input

        String[] roman_converted = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; // Largest to Smallest
        int[] values_arr = {1000, 900, 500, 400, 100, 90, 50,40, 10, 9, 5, 4, 1}; // Largest to Smallest
     // String Builder class to use String as Mutable object: Fast Implementation
     StringBuilder build = new StringBuilder();
        for (int i=0; i<values_arr.length && num > 0; i++){
            while(num >= values_arr[i]){
                 num -= values_arr[i];
                build.append(roman_converted[i]); 
               
            }
        }
        return build.toString();
    }
}
