import java.util.Scanner;

//바둑이 승차
public class Main_4 {
    static int n,m;
    static int[] pm;

    public void DFS(int L) {
        if(L==m){
            for (int x:pm) {
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=1;i<=n;i++){
                pm[L]=i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args) {

        Main_4 T = new Main_4();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        pm=new int[m];

        T.DFS(0);

    }
}