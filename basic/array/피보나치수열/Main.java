package algorithm.basic.array.피보나치수열;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int num) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);

        for (int i = 2; i < num; i++) {
            answer.add(answer.get(i - 2) + answer.get(i - 1));
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int x : main.solution(num)) {
            System.out.print(x + " ");
        }
    }
}
