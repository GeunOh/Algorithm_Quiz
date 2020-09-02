package Programmers_Quiz;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
	public static long solution(int n) {
        long answer = 0;
        System.out.println(Integer.toString(n).chars());
        String[] a = Long.toString(n).split("");
        Arrays.sort(a, Collections.reverseOrder());
        answer = Long.parseLong(String.join("", a));
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}

}
