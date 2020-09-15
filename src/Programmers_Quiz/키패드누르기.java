package Programmers_Quiz;

public class 키패드누르기 {
	
	public static String solution(int[] arr, String hand) {
        String answer = "";
        int[][] numbers = {{1,4,7},{2,5,8,0},{3,6,9}};
        int left = 0, right = 0;
        for(int n=0; n<arr.length; n++) {
        	int s = arr[n];
	        for(int i=0; i<numbers.length; i++) {
	        	for(int j=0; j<numbers[i].length; j++) {
	        		if(numbers[i][j] == s) {
	        			if(i==0) {
	        				answer += "L";
	        				left = j;
	        			}else if(i==1) {
	        				if(Math.abs(j-left)>Math.abs(j-right)) answer += "R";
	        				else if(Math.abs(j-left)==Math.abs(j-right)) {
	        					if(hand.equals("left")) answer += "L";
	        					else answer += "R";
	        				}
	        				else answer += "L";
	        			}else {
	        				answer += "R";
	        				right = j;
	        			}
	        			
	        		}
	        	}
	        }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(solution(arr, hand));
	}

}
