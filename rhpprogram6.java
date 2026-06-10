import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int a1 = a.length();
        int b1 = b.length();
        int grid[][] = new int[a1+1][b1+1];
        int max = 0;
        for(int i = 1; i <= a1; i++){
            for(int j = 1; j <= b1; j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    grid[i][j] = grid[i-1][j-1]+1;
                    if(grid[i][j] > max){
                    max = grid[i][j];
                }
                }
                else{
                    grid[i][j] = 0;
                }
            }
        }System.out.println(max);
        
    }
}