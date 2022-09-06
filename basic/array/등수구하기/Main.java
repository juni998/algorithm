package algorithm.basic.array.등수구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int arr[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) cnt++;
            }
            answer.add(i, cnt);
            cnt = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i : main.solution(n, arr)) System.out.print(i + " ");
    }
}
