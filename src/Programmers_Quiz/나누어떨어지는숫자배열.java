package Programmers_Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
	public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        int cnt = 0;
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor==0) {
        		list.add(arr[i]);
        		cnt++;
        	}
        }
        if(cnt==0) list.add(-1);
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
	}
}
