package Crashcourse;

public class Returntype {
	
	Integer amount = 1000;
	
	public Integer CollectionAmount() {
		
	System.out.println("collected the amount Guys");
		return amount;	
	}
	public static void main(String[] args) {
		
		Returntype tt = new Returntype();
		Integer amount =tt.CollectionAmount();
		
		System.out.println(amount);
	}
}
