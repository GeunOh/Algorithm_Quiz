package Programmers_Quiz;

public class 최대공약수와최소공배수 {
	
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int a = 0, b = 0, i=1;
        
        if(n > m) {
        	a=n;//큰수
        	b=m;//작은수
        }else {
        	a=m;//큰수
        	b=n;//작은수
        }
        
        while(i<=b) {
        	if(a%i==0 && b%i==0) answer[0] = i;
        	i++;
        }
        
        answer[1] = a*b/answer[0];
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution(2, 5);
	}

}
