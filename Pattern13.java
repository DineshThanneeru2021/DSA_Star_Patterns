# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



1 

2 3 

4 5 6 

7 8 9 10 

11 12 13 14 15

  class Solution {
    public void pattern13(int n) {
        int start=1;
        for(int i=1;i<=n;i++)
        {
            //int count=0;
            
            for(int count=1;count<=i;count++)
            {
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }

    }
}
