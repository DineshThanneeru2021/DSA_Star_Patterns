# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



*********
 *******
  *****
   ***
    *

  class Solution {
    public void pattern8(int n) {
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
