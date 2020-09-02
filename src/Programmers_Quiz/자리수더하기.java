package Programmers_Quiz;

public class 자리수더하기 {
	 public static int solution(int n) {
        int answer = 0;
        
        while(n>0) {
        	answer += n%10;
        	n /= 10;
        }
        return answer;
     }
	 
	 public static void main(String[] args){
			
			solution(987);
	 } 
}
