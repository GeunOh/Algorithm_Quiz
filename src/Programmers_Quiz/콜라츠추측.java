package Programmers_Quiz;

public class 콜라츠추측 {
	
	public static long solution(long num) {
		 long answer = 0;
         while(num!=1) {
        	
        	if(num%2==0)  num/=2;
        	else num=(num*3)+1;
        	
        	answer++;
        	
            if(answer>=500) {
                answer = -1;
                break;
            }
         }
         return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(1));
	}

}
