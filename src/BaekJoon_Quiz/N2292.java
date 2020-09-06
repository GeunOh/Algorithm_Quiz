package BaekJoon_Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N2292 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=1, end=1;
		
		while(true) {
			if(n<=end) break;
			end += (cnt++)*6;
		}
		System.out.println(cnt);
	}

}
