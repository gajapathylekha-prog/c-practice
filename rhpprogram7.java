import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int a1 = a.length();
        int b1 = b.length();
        int grid[][] = new int[a1+1][b1+1];
        for(int i = 1; i <= a1; i++){
            for(int j = 1; j <= b1; j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    grid[i][j] = grid[i-1][j-1]+1;
                }
                else{
                    grid[i][j] = Math.max(grid[i][j-1],grid[i-1][j]);
                }
            }
        }System.out.println(grid[a1][b1]);
        
    }
}
