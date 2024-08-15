import java.util.Arrays;

public class Knapsack {
    static int max(int a,int b){return(a>b)?a:b;}

    static int knapSack(int W,int wt[],int p[],int n){
        
        int dp[]=new int[W+1];
        for (int i=1;i<=n;i++){
            for(int w=W;w>=0;w--){
                   if(wt[i-1]<=w){
                    dp[w]=max(dp[w],dp[w-wt[i-1]]+p[i-1]);
                   }
            }
        }
         System.out.println(Arrays.toString(dp));
        return dp[W];
     

    }
    public static void main(String[] args) {
        int p[]={25,24,15};
        int wt[]={18,15,10};
        int W=20;
        int n=p.length;
        System.out.println(knapSack(W,wt,p,n));
    }
}
