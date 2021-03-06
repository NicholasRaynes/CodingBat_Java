/**
* This class includes the declaration, implementation, and testing for
* the double23 method.
*
* @author NicholasRaynes
* @version 0.0.1
* @see https://codingbat.com/prob/p145365
*/
public class Double23
{
   public static void main(String[] args)
   {
     int[] test1 = { 2, 2 };
     int[] test2 = { 3, 3 };
     int[] test3 = { 2, 3 };
    
     System.out.printf("Test #1 - double23([2, 2])\nOutput:%b\n", double23(test1));
     System.out.printf("Test #2 - double23([3, 3])\nOutput:%b\n", double23(test2));
     System.out.printf("Test #3 - double23([2, 3])\nOutput:%b\n", double23(test3));
   }
  
   /**
   * Given an int array, this method returns true if the array contains 2 twice, or 3 twice. 
   * The array will be length 0, 1, or 2.
   *
   * @param nums The array to be searched through.
   * @return Whether or not the array contains 2 twice, or 3 twice.
   */
   public static boolean double23(int[] nums) 
   {
      if (nums.length != 1 && nums.length != 0 )
      {
        return ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3 ));
      }
      else
      {
        return false;
      }
   }
}
