package algorithm.basic.twoPointer.연속자연수합;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        //math
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }
        
        /* two pointer
        int m = n / 2 + 1;
        int arr[] = new int[m];
        int lt = 0, sum = 0;


        for (int i = 0; i < m; i++) {
            arr[i] = i+1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        */

        return answer;
    }

        public static void main(String[] args) {
            Main main = new Main();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            System.out.println(main.solution(n));
        }
}
