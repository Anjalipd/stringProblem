
public class RemoveChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdd";
		removeCh(s, 'e');
		removeCh2(s,'k');
	}
	
//Iterate through the String, one character at a time	
	public static String removeCh(String s , char c){
		if(s.length() == 0){
			return s;
		}
		if(c == ' '){
			return s;
		}		
		char[] c1= s.toCharArray();
		StringBuilder result = new StringBuilder();
		for(int i=0; i<s.length() ; i++){
			if(c1[i] == c){
				continue;
			}else {
				result.append((Character.toString(c1[i])));			
			}			
		}
		return result.toString();
		
	}
//Find a method in the String class that can solve this in one line	
	public static String removeCh2(String s , char c){
		if(s.length() == 0){
			return s;
		}
		if(c == ' '){
			return s;
		}
		String result = s.replaceAll(Character.toString(c),"");
		return result;
	}

}
