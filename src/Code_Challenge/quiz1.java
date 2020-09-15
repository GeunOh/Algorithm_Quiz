package Code_Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class quiz1 {
	
	public static int[] solution(int[] numbers) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        
        
        for(int i=0; i<numbers.length; i++) {
        	for(int j=0; j<numbers.length; j++) {
        		if(i!=j) list.add(numbers[i] + numbers[j]);
        	}
        }
        
        ArrayList<Integer> alist = new ArrayList<>(list);
        
        Collections.sort(alist);
        
        int[] answer = new int[alist.size()];
        
        for(int i=0; i<alist.size(); i++) {
        	answer[i] = alist.get(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {5,0,2,7};
		System.out.println(Arrays.toString(solution(arr)));
	}

}
