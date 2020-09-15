package Programmers_Quiz;

public class 하샤드수 {
	public static boolean solution(int x) {
        boolean answer = true;
        int N=x, sum=0;
        while(N>0) {
        	sum += N%10;
        	N /= 10;
        }
        
        if(x%sum != 0) answer = false; 
  
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(11));

	}

}
