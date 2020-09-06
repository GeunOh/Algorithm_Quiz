package BaekJoon_Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N2839 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sugar = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		//나누어질때 
		while(true) {
			if(sugar%5==0) {
				System.out.println(sugar/5 + cnt);
				break;
			}else if(sugar<=0) {
				System.out.println(-1);
				break;
			}
			sugar -= 3;
			cnt++;
		}
		
	}

}
