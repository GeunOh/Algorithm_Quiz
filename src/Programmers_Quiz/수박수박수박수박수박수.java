package Programmers_Quiz;

public class 수박수박수박수박수박수 {
	public String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n; i++) {
        	if(i%2==1) answer += "수";
        	else answer += "박";
        }
        System.out.println(answer);
        return answer;
    }
}
