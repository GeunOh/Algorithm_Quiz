package Programmers_Quiz;

public class 짝수와홀수 {
	
	public static String solution(int num) {
        return num%2==0 ? "oven" : "odd";
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
	}

}
