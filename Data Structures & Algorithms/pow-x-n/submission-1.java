class Solution {
    public double myPow(double x, int N) 
    {
        long n=N;
        boolean neg=false;
        double ans=1;

        if(n<0)
        {
            neg=true;

            n=-n;
        }
        
        while(n>0)
        {
            if(n%2!=0)
            {
                ans=ans*x;
                n-=1;
            }
            else
            {
                x=x*x;
                n=n/2;
            }
        }
        if(neg) return (double)(1)/(double)ans;
        return ans;
    }
}
