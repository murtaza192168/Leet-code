class Solution_8 {
    public static void main(String[] args){
        // Give user input here

        // call the method
        int stringToInt_result = myAtoi(str);
        // dissplay the result.
    }

    public int myAtoi(String s) {

        //Is string empty? if yes then return zero
        if(s.equals("")){return 0;} /*if string equals to an empty string then return 0 bcz its no use to move forward with the excecution*/
        
          // Helper variables that is being initialised here
        int i = 0, result_in_int = 0, sign = 1;
        
          /* 1) Check for whitespaces */
          while(i < s.length() && s.charAt(i) == ' '){
              i++;
            }
            /* 2) Check for signs +ve OR -ve */
            
            if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            {
                if((s.charAt(i++) == '-')){  // charAt(i++) > to iterate characters over a string
                     sign = -1; 
                    
                 }
             // check this by reducing this step
            
            }

            // Actual login
            /*  3) Check for range */
            while(i < s.length() && ( s.charAt(i) >= '0' ) && ( s.charAt(i) <= '9' ))
            {
                // Check for range of 32-bit integer
                if(result_in_int > Integer.MAX_VALUE/10 || ((result_in_int == Integer.MAX_VALUE/10) && s.charAt(i) - '0' > Integer.MAX_VALUE%10))
                {
                    if(sign == -1){
                        return Integer.MIN_VALUE;
                    }
                    
                    return Integer.MAX_VALUE;
                }

                result_in_int = result_in_int * 10 + (s.charAt(i++) - '0') ; // charAt(i++) > to iterate characters over a string
                 // check for steps reduction
            }

        return result_in_int * sign;   // if the result is a negative integer, then using sign multiplication the result will be prefixed with a negative sign (As asked to perform in the prblem statement)
    }        
}
