import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int a[][]=new int[R][C];
        long dp[][]=new long[R+1][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                a[i][j]=sc.nextInt();
                if(i==0){
                    dp[i][j]=a[i][j];
                }
            }
        }long fsmax[]=getMax(dp,0,C);
        long fmax=fsmax[0];
        long smax=fsmax[1];
        for(int i=1;i<R;i++){
            for(int j=0;j<C;j++){
                if(dp[i-1][j]==fmax){
                    dp[i][j]=a[i][j]+smax;
                }else{
                    dp[i][j]=a[i][j]+fmax;
                }
            }
            fsmax=getMax(dp,i,C);
            fmax=fsmax[0];
            smax=fsmax[1];
        }System.out.println(fmax);
    }private static long[] getMax(long dp[][],int R,int C){
        long fmax=Math.max(dp[R][0],dp[R][1]);
        long smax=Math.min(dp[R][0],dp[R][1]);
        for(int j=2;j<C;j++){
            if(dp[R][j]>fmax){
                smax=fmax;
                fmax=dp[R][j];
            }else if(dp[R][j]>smax){
                smax=dp[R][j];
            }
        }
            return new long[]{fmax,smax};
    }
}