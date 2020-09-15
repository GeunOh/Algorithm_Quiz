package Programmers_Quiz;

import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<answer.length; i++) 
        	answer[i] += (long)x*(i+1);
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(-4, 2)));
	}

}
