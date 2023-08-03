import java.util.Scanner;
//바둑이 승차
public class Main_2 {
    static int answer=Integer.MIN_VALUE;
    static int c,n;

    public void DFS(int L, int sum, int[] arr) {
        if(sum>c) return;
        if(L==n){
            answer=Math.max(answer,sum);
        }else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L,sum,arr);
        }
    }


    public static void main(String[] args) {

        Main_2 T = new Main_2();
        Scanner kb = new Scanner(System.in);
        c=kb.nextInt();
        n=kb.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=kb.nextInt();
        }

        T.DFS(0,0,arr);

        System.out.println(answer);

    }
}