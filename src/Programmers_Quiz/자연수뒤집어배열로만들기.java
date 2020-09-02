package Programmers_Quiz;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
	
	public static int[] solution(long n) {
        
        int length = Long.toString(n).length();
        int[] answer = new int[length];
        int i=0;
        while(n>0) {
        	 answer[i] = (int) (n%10);
        	 n/=10;
        	 i++;
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		long n = 12345;
		System.out.println(Arrays.toString(solution(n)));
	}

}
