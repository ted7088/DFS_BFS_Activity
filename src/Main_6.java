import java.util.Scanner;

public class Main_6 {
    static int n, m;
    static int[] pm, ch, arr;


    public void DFS(int L) {
        if(L==m){
            for(int x : pm ) System.out.println(x+" ");
            System.out.println();

        }else{
            for(int i=0;i<n;i++){
                if(ch[i]==0){
                    ch[i]=1;
                    pm[L]=arr[i];
                    DFS(L+1);
                    ch[i]=0;
                }
            }

        }


    }

    public static void main(String[] args) {
        Main_6 T = new Main_6();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

        ch = new int[n];
        pm = new int[m];
        T.DFS(0);

    }
}