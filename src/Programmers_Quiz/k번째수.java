package Programmers_Quiz;

import java.util.Arrays;

public class k번째수 {
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        System.out.println(commands[0][0]-1);
	        for(int i=0; i<commands.length; i++) {
	        	int[] cArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	        	Arrays.sort(cArr);
	        	answer[i]= cArr[commands[i][2]-1];
	        }
	        return answer;
	    }
}
