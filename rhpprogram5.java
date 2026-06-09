import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int grid[][]=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int row=sc.nextInt();
        int col=sc.nextInt();
        int diff[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int i=0;i<8;i++){
            int ar=row+diff[i][0],ac=col+diff[i][1];
            if(ar>=0 && ar<R && ac>=0 && ac<C){
                sum+=grid[ar][ac];
            }
        }
        System.out.println(sum);
    }
}