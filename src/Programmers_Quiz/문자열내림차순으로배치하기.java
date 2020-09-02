package Programmers_Quiz;

import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {
	public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        answer = String.join("", arr);
         
        return answer;
    }
}
