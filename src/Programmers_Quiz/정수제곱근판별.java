package Programmers_Quiz;

public class 정수제곱근판별 {
	public static long solution(long n) {
        long answer = 0;
        
        double t = Math.sqrt(n);
        double t2 = Math.floor(t);
        answer = (long)Math.pow(t+1,2);
        if(t>t2) answer=-1; 
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(3));
	}

}
