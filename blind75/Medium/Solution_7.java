class Solution_7 {
public static void main(String[] args){
    // Give user input here

    //Call the method
    int reversed_result = reverse(num);
    //print the output here
}

    public int reverse(int x) {
        int rev = 0, rem;
      while(x != 0){
          rem = x % 10; // find out remainder (last digit of x)
          x /= 10;      // now update the original number by removing the remainder digit from it

          /*Check if the reversed number found, is not in range i.e.
          from Math.pow(-2, 31) : [-2147483648] and 
               Math.pow((2,31)-1) : [+214783648], return zero.
               You are noy going to calculate in the code, you will just reverse digits one by one EXCEPT the LAST DIGIT. Once both numbers (except the last ones) are similar after that you will separately check for last digit that are 7 for +ve and -8 for negative 
          */ 
          if(rev < Integer.MIN_VALUE/10 || ((rev == Integer.MIN_VALUE/10) && (rem < -8)))
          {return 0;}
          if(rev > Integer.MAX_VALUE/10 || ((rev == Integer.MAX_VALUE/10) && rem > 7))
          {return 0;}
        
         rev = (rev * 10) + rem;   
      }     
      return rev;   
    }
}
