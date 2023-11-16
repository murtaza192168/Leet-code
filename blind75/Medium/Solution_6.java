class Solution_6 {

    public static void main(String[] args){
       //Give user input here
      
       // Call method here
       String result = convert(str, numOfRows);
       // Print the zigzag conversion result here.
     }


    public String convert(String s, int numRows) {
        // Check for the base condition
        // 1) Check if string is null or Empty? OR check if the row length is equals zero
      if(s == null || s.isEmpty() || numRows <= 0){
        return "";
      }  
      if (numRows == 1){
        return (s);
      }

      // Define a String builder class and create an object for it
       StringBuilder resultant_str = new StringBuilder();

       // Define a formula for the step (Basically the common interval between the char indexes)
        int step = 2 * numRows - 2;

        // Start the actual process
        for(int rno = 0; rno < numRows; rno++) // For loop to upon the rows
        {
            for(int index = rno; index < s.length(); index+=step){
                resultant_str.append(s.charAt(index));

                if(rno != 0 && rno != numRows - 1 && (index + step - 2 * rno) < s.length())
                {
                  resultant_str.append(s.charAt(index + step - 2 * rno));
                }
            }
        }
        return resultant_str.toString();
    }
}
