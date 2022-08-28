package algorithm.basic.array.보이는학생;
import java.util.Scanner;

public class Main {
    public int solution(int num, int arr[]) {
        //첫 번째 학생은 무조건 볼 수 있으니 1로 설정
        int answer = 1;
        int max = arr[0];

        for (int i = 1; i < num; i++) {
            //첫 번째 학생 보다 커야 보이기 때문에 MAX에 첫 번째 학생을 저장하고,
            //앞의 학생보다 클 경우 MAX에 저장하고 +1
            if (max < arr[i]) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(main.solution(num, arr));
    }
}
