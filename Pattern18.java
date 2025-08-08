# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



E 

D E 

C D E 

B C D E 

A B C D E

class Solution {
    public void pattern18(int n) {
        for(int i=1;i<=n;i++)
        {
            char ch=(char)('A'+n-i);
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();


        }

    }
}
