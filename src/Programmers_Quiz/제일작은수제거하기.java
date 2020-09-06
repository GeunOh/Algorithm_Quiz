package Programmers_Quiz;

import java.util.Arrays;

public class 제일작은수제거하기 {
	public static int[] solution(int[] arr) {
		int[] answer = {};
		int min = arr[0];
		int chk = 0; // 제일작은수 체크
		int cnt = 0; // 배열 돌리기
		if(arr.length==1) {
			answer = new int[]{-1};
		}else {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]<min) min = arr[i];
			}
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==min) chk=i;
			}
			answer = new int[arr.length-1];
			
			for(int i=0; i<arr.length; i++) {
				if(i!=chk) answer[cnt++] = arr[i]; 
			}
		}
		System.out.println(Arrays.toString(answer));
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {1,10};
		solution(arr);
	}

}
