package Programmers_Quiz;

import java.text.ParseException;

public class 이상한문자만들기 {
	 public static String solution(String s) {
        String answer = "";
        int cnt = 0;
        char[] str = s.toLowerCase().toCharArray();
        
        for(int i=0; i<str.length; i++) {
        	
    		if(cnt%2==0) {
    			answer += Character.toUpperCase(str[i]);
    			cnt++;
    		}else {
    			answer += Character.toLowerCase(str[i]);
    			cnt++;
    		}
        	
        	if(str[i]==' ') cnt = 0;
        }
        System.out.println(answer);
        return answer;
     }
	 
	 public static void main(String[] args) throws ParseException {
			
		String s = "try hello world";
		solution(s);
	 } 
}
