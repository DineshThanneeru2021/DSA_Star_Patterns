# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



1 

0 1 

1 0 1 

0 1 0 1 

1 0 1 0 1

  class Solution {
    public void pattern11(int n) {
        for(int i=1;i<=n;i++)
        {
            int start=1;
            if(i%2==0)
              start=0;
            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;

            }
            System.out.println();
        }

    }
}
