package BaekJoon_Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N5662 {

	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int result = 0;
		String[] arr = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j].contains(s.substring(i, i+1))) {
					result += j+3;
				}
			}
		}
		System.out.println(result);
	}

}
