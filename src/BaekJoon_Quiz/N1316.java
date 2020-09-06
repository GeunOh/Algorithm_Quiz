package BaekJoon_Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class N1316 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=0; i<n; i++) {
			result += check(br.readLine());
		}
		System.out.println(result);
	}
	public static int check(String s) {
		boolean[] tArr = new boolean[26];
		int prev = 0;
		
		for(int i=0; i<s.length(); i++) {
			int now = s.charAt(i);
			
			if(prev != now) {
				if(tArr[now -'a'] == false) {
					tArr[now - 'a'] = true;
					prev = now;
				}else {
					return 0;
				}
			}else {
				continue;
			}
			
		}
		
		return 1;
	}
	
}
