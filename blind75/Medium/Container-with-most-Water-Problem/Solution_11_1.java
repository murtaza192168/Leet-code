class Solution_11 {

  public static void main(String[] args){
     // Give user Input here

     //Invoke the method of Maximum area search
     int result = maxArea(height);
     // Display the result
  }
    
public static int maxArea(int[] height) {


// BRUTE FORCE APPROACH
        int max_area = 0;
        for(int i=0; i<height.length; i++){
          for(int j=0; j<height.length; j++){
            int area = (Math.min(height[i], height[j]) * Math.abs(i - j));
            max_area = Math.max(max_area, area);
          }
        }
        return max_area;
   }
}
