class Solution_9 {
    public static void main(String[] args){
        // Give user input here

        //Call the method
        boolean reversed_integer = isPalindrome(x);
        // Display your result here
    }

    public boolean isPalindrome(int x) {
       
        // check whether number entered is zero
        // obviously if number entered by the user is zero or any single integer it is going to be Palindrome i.e. true
        if(x == 0){
            return true;
        }
        // check if its a negative number entered, than its not a palinf=drome because when it gets reversed the negative sign comes on the right hand side and as a result rev is mismatched
        if(x < 0 ){
            return false;
        }
         // helper members
        int rev = 0, original_num = x, rem;
        

        while(x > 0){
            rem = x % 10;  // the ones unit digit will be returned / stored in remainder
            x = x / 10;
         // including the any special character or a sign so that along with digit_nums they also get reversed
                
         ///
            rev = rev * 10 + rem;
        }
        // check if original number matches the reversed one
        return (rev == original_num);
        
    }
}
