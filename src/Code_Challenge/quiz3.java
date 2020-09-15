package Code_Challenge;

import java.util.ArrayList;

public class quiz3 {
	public static int solution(int[] a) {
        int answer = 0;
        int select = 0;
        int result = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<a.length; i++) {
        	list.add(a[i]);
        }
        
        for(int i=0; i<1; i++) {
        	System.out.println("i의 번호 : " + i);
        	result += alive(list, i);
        }
        
        return answer;
    }
	
	public static int alive(ArrayList<Integer> list, int l) {
		boolean chance = true;
		int temp = 0;
		int temp2 = 0;
		System.out.println(l);
		if(l != 0) {
			temp = list.get(l);
			temp2 = list.get(0);
			list.set(0, temp);
			list.set(l, temp2);
		}
		if(list.get(0) < list.get(1)) {
			list.remove(1);
		}
		if(list.get(0) > list.get(1)) {
			if(chance) list.remove(1);
			else list.remove(0);
		}
		System.out.println(list);
		return list.contains(temp)?1:0;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {9, -1, -5};
		solution(arr);
	}
}
