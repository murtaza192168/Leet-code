class Solution_13 {

    public static void main(String[] args){
        // Give user Input here

        // Call the method to convert Roman numeral to Integer value
        int romanToInt_result = romanToInt(str);
        //Display the result here
    }
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //We will start comparying from Left to Right
        // s.length-1 char value will be stored in the result initially
        int result = map.get(s.charAt(s.length()-1));
        // Loop from Left to Right
        for(int i=s.length()-2; i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result = result - map.get(s.charAt(i));
            }
            else{
                 result = result + map.get(s.charAt(i));
            }
        }
        return result;
    }
}
