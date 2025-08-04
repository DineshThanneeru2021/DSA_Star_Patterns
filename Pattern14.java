# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



A

AB

ABC

ABCD

ABCDE

  class Solution {
    public void pattern14(int n) {
        for(int i=1;i<=n;i++)
        {
            char first='A';
            for(int j=0;j<i;j++)
            {
                char nextChar=(char)('A'+j);
                System.out.print(nextChar);
            }
            System.out.println();
        }

    }
}
