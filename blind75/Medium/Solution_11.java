class Solution_11 {

  public static void main(String[] args){
     // Give user Input here

     //Invoke the method of Maximum area search
     int result = maxArea(height);
     // Display the result
  }
    public static int maxArea(int[] height) {

        // TWO POINTERS APPROACH : TC = O(N) SC = O(1)
        int  max_area = 0; // declare and initialize the maximum height to zero
        int i_pointer = 0; // Index of a height array element at the initial position zero
        int j_pointer = (height.length-1);// Index of height array element at the last position

        while(i_pointer < j_pointer)
        {
          // Condition 1:
          if(height[i_pointer] > height[j_pointer])
          {
            max_area = Math.max( max_area, (height[j_pointer] * (j_pointer - i_pointer)));
            j_pointer--;
          }

          else
          {
               max_area = (Math.max( max_area, (  height[i_pointer] * (j_pointer - i_pointer)  )));
              i_pointer++;
          }
        }
        return  max_area;
    }
}
