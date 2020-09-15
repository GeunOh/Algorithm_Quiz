package Programmers_Quiz;

import java.util.Arrays;

public class 체육복 {
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];
        
        //1으로 초기화
        for(int i=0; i<n; i++) {
        	student[i] = 1;
        }
        //체육복 안가져온애들 -1
        for(int i=0; i<lost.length; i++) {
        	student[lost[i]-1] -= 1;
        }
        
        //체육복 가져온애들 +1
        for(int i=0; i<reserve.length; i++) {
        	student[reserve[i]-1] += 1;
        }
        
        //체육복 배분
        for(int i=0; i<student.length; i++) {
        	
        	if(student[i]==0) {
        		if(i == 0){
        			if(student[i+1]==2) {
            			student[i+1] -= 1;
            			student[i] += 1;
            		}
        		}
        	}else if(i == student.length-1) {
        			if(student[i-1]==2) {
            			student[i-1] -= 1;
            			student[i] += 1;
            		}
        	}else {
        			if(student[i-1]==2) {
            			student[i-1] -= 1;
            			student[i] += 1;
            		}else if(student[i+1]==2) {
            			student[i+1] -= 1;
            			student[i] += 1;
            		}
        		}
        	}
        
        
        for(int i=0; i<student.length; i++) {
        	if(student[i] == 1 || student[i] == 2) answer += 1;
        }
        System.out.println(answer);
        System.out.println(Arrays.toString(student));
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {4,5};
		int[] reserve = {1,5};
		solution(n, lost, reserve);
	}

}
