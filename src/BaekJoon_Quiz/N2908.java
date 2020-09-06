package BaekJoon_Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2908 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int ra = (a % 10) * 100 + a / 10 % 10 * 10 + a/100;
	    int rb = (b % 10) * 100 + b / 10 % 10 * 10 + b/100;
		
		if(ra>rb) System.out.println(ra);
		else System.out.println(rb);
		
	}
}
