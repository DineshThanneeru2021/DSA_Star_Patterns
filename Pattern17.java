# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

  class Solution {
    public void pattern17(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            char ch='A';
            int breakPoint=(2*i-1)/2;
            for(int j=1;j<2*i;j++)
            {
                System.out.print(ch);
                if(j<=breakPoint)
                {
                    ch++;
                }
                else
                ch--;
            }
            System.out.println();
        }

    }
}
