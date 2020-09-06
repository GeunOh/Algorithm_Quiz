package BaekJoon_Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N2491 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] word = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String str = br.readLine();
		for(int i=0; i<word.length; i++) {
			if(str.contains(word[i])) {
				str = str.replaceAll(word[i],"*");
			}
		}
		System.out.println(str.length());
	}

}
