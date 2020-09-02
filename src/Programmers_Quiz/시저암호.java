package Programmers_Quiz;

public class 시저암호 {
	public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
        	int ch = s.charAt(i);
        	
        	//대문자 -보다%연산이 더 빠름
        	if(ch>=65&&ch<=90) {
        		ch += n;
        		if(ch>90) {
        			ch = 65+((ch-91)%26);
        			answer += (char)ch;
        		}else {
        			answer += (char)ch;
        		}
        	}
        	//소문자
        	if(ch>=97&&ch<=122) {
        		ch += n;
        		if(ch>122) {
        			ch = 65+((ch-123)%26);
        			answer += (char)ch;
        		}else {
        			answer += (char)ch;
        		}
        	}
        	//공백
        	if(ch == ' ') answer += (char)' ';
        }
        return answer;
    }
}
