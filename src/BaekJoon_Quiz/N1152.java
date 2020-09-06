package BaekJoon_Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N1152 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String s = br.readLine();
			System.out.println(s.isEmpty());
			if(s.isEmpty()) System.out.println(0);
			else System.out.println(s.split(" ").length);
			
		}
	}

}
