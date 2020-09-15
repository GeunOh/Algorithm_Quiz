package KaKao_Quiz;

public class Quiz1 {
	public static String solution(String new_id) {
		
        	//조건에 맞지 않을시 새로운 아이디 추천
        	//1
        	new_id = new_id.toLowerCase();
        	//2
        	new_id = new_id.replaceAll("[^a-z0-9\\-\\_\\.]", "");
        	//3
        	new_id = new_id.replaceAll("\\.{2,}", ".");
        	//4
        	new_id = new_id.replaceAll("^[\\.]", "");
        	//4
        	new_id = new_id.replaceAll("[\\.]$", "");
        	//5
        	new_id = new_id.isEmpty()? "a" : new_id;
        	//6
        	if(new_id.length()>=16) {
        		new_id = new_id.substring(0,15);
        		new_id = new_id.replaceAll("[\\.]$", "");
        	}
        	//7
        	if(new_id.length() <= 2) {
                String last = new_id.substring(new_id.length()-1);
                while(new_id.length()<3) {
                	new_id = new_id + last;
                }
            }
        	return new_id;
        }
        
	public static void main(String[] args) {
		solution("abcdefghijklmn.p");
	}

}
