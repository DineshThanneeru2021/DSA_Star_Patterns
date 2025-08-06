# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



A

BB

CCC

DDDD

EEEEE

  class Solution {
    public void pattern16(int n) {
        char start='A';
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(start);
            }
            start++;
            System.out.println();
        }

    }
}
