import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Max = 200000;
        int diff[]=new int[Max+2];
        int pre[]= new int[Max+2];
        for(int i=0;i<a;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            diff[l]++;
            diff[r+1]--;
        }for(int i=1;i<=Max;i++){
            diff[i]+=diff[i-1];
            pre[i]=pre[i-1];
            if(diff[i]>=b){
                pre[i]++;
            }
        } for(int i=0;i<c;i++){
            int v=sc.nextInt();
            int g=sc.nextInt();
            System.out.println(pre[g]-pre[v-1]);
        }
    }
}