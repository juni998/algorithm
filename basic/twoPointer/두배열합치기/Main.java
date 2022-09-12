package algorithm.basic.twoPointer.두배열합치기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int nrr[], int m, int mrr[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (nrr[p1] > mrr[p2]) {
                answer.add(mrr[p2]);
                p2++;
            } else if (nrr[p1] < mrr[p2]){
                answer.add(nrr[p1]);
                p1++;
            } else {
                answer.add(nrr[p1]);
                answer.add(mrr[p2]);
                p1++; p2++;
            }
        }

        if (n > m) {
            for (int i = p1; i < n; i++) answer.add(nrr[i]);
        } else {
            for (int i = p2; i < m; i++) answer.add(mrr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nrr = new int[n];
        for (int i = 0; i < n; i++) nrr[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] mrr = new int[m];
        for (int i = 0; i < m; i++) mrr[i] = sc.nextInt();

        for (int x : main.solution(n, nrr, m, mrr)) System.out.print(x + " ");

    }
}
