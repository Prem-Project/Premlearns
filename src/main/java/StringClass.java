public class StringClass {

	public static void main(String[] args) {
	
	String s="preaamnaaath";
	
	StringBuilder b = new StringBuilder();
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		int ind = s.indexOf(ch,i+1);
		if(ind==1) {
		b.append(ch);	
		}
	}
	}
}
