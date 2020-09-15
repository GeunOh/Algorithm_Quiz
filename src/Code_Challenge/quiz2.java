package Code_Challenge;

import java.util.Arrays;

public class quiz2 {
	public static int[] solution(int n) {
		
		int N = 0;
		
		for (int i = 1; i <= n; i++) N += i;
		
		int[] answer = new int[N];
		
		int[][] arr = new int[n][n];
		int x = -1, y = -1;
		int num = 1;
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				if (i % 3 == 0) {
					x++;
					y++;
				} else if (i % 3 == 1) {
					y--;
				} else if (i % 3 == 2) {
					x--;
				}
				arr[x][y] = num++;
			}
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= 0; j--) { // 대각선 기준 좌하단만 출력
				if(arr[i][j] != 0) {
					answer[cnt++] =  arr[i][j];
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5)));
	}

}
