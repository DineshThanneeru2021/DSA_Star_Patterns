# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

  class Solution {
    public void pattern19(int n) {
        firstPattern(n);
        secondPattern(n);
    }
    private static void firstPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");

            }
            for(int j=1;j<2*i-1;j++)
            {
                System.out.print(" ");


            }
             for(int j=i;j<=n;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }

    }
    private static void secondPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");


            }
             for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
