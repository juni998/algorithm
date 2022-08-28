package algorithm.basic.array.큰수출력하기;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        //첫 번째 수는 무조건 출력
        answer.add(arr[0]);

        for (int i = 1; i < n; i++) {
            //배열의 앞 수보다 큰 수만 answer에 추가
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : main.solution(num, arr)) {
            System.out.print(x + " ");
        }
    }
}
