package re;

import java.util.Scanner;

public class Main_3 {
    static int n, m, answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int time, int[] a, int[] b) {
        if(time>m) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + a[L], time + b[L], a, b);
            DFS(L + 1, sum, time, a, b);
        }
    }


    public static void main(String[] args) {

        Main_3 T = new Main_3();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }

        T.DFS(0, 0, 0, a, b);

        System.out.println(answer);


    }
}
