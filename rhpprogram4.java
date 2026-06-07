import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C= sc.nextInt();
        int a[][]=new int[R][C];
        long dp[][]=new long[R+1][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                a[i][j]=sc.nextInt();
                if(j==0){
                    dp[i][j]=a[i][j];
                }
            }
        }
        long fsMax[]=getMax(dp,R,0);
        long fMax=fsMax[0];
        long sMax=fsMax[1];
        for(int j=1;j<C;j++){
            for(int i=0;i<R;i++){
                if(dp[i][j-1]==fMax){
                    dp[i][j]=a[i][j]+sMax;
                }else{
                    dp[i][j]=a[i][j]+fMax;
                }
            }fsMax=getMax(dp,R,j);
            fMax=fsMax[0];
            sMax=fsMax[1];
        }
        System.out.println(fMax);
    }
    private static long[] getMax(long dp[][],int r,int j){
        long fMax=Math.max(dp[0][j],dp[1][j]);
        long sMax=Math.min(dp[0][j],dp[1][j]);
        for(int i=2;i<r;i++){
            if(dp[i][j]>fMax){
                sMax=fMax;
                fMax=dp[i][j];
            }else if(dp[i][j]>sMax){
                sMax=dp[i][j];
            }
        } 
        return new long[]{fMax,sMax};
    }
}