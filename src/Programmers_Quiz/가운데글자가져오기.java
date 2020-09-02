package Programmers_Quiz;

public class 가운데글자가져오기 {
	public String solution(String s) {
        String answer = "";
        
        int sLength = s.length();

        if(sLength%2==0) {
        	answer = s.substring(sLength/2-1,sLength/2+1);
        	
        }else {
        	answer = s.substring(sLength/2);
        }
        System.out.println(answer);
        return answer;
    }
}
