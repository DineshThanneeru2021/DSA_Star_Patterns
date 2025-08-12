# Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



*****
*   *
*   *
*   *
*****

class Solution {
    public void pattern21(int n) {
        // for no.of rows  
        for(int i=1;i<=n;i++)
        {
            
                if(i==1 || i==n)
                {
                    //for no. stars in 1st & last  line 
                    for(int j=1;j<=n;j++)
                    {
                        System.out.print("*");
                        
                    }
                            
                }
                // no. of stars and spaces in each line except 1st & last line
                else
                {
                    System.out.print("*");
                    // for spaces
                    for(int j=1;j<=n-2;j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            

        }

    }
}
