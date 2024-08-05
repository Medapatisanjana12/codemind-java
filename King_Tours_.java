import java.util.Scanner;
public class King{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int m=read.nextInt();
        int ans=5*n+7*m;
        System.out.println(ans);
    }
}