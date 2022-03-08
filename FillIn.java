import java.util.ArrayList;

public class FillIn extends Question {
	ArrayList<String> test = new ArrayList<String>();
	int suraq;
	
	public FillIn (ArrayList<String> test, int suraq) {
		this.test = test;
		this.suraq = suraq;	
	}
	
	public void output() {
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
	
		System.out.println("\n" + suraq + ". " + super.getText());
	
		char [] alp = {'A', 'B', 'C', 'D'};
	
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		
	}
	
	public String outputQ(String s) {
		String ans = "";
		for (int i = 3; i < s.length(); i++) {
			ans += s.charAt(i);
		}
		return ans;
	}
}
