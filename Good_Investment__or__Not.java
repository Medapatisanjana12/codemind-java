import java.util.Scanner;
    public class Sample{
        public static void main(String[] args){
            Scanner read=new Scanner(System.in);
            int x=read.nextInt();
            int y=read.nextInt();
            if(x>=2*y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
}