# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



    * 
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

  class Solution {
    public void pattern9(int n) {
        pyramid(n);
        invertedPyramid(n);


    }
    private static void pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    private static void invertedPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i)*2+1;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
