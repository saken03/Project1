import java.util.ArrayList;
import java.util.Scanner;

public class Test extends Question {
	
	ArrayList<String> test = new ArrayList<String>();
	int suraq;

	public Test (ArrayList<String> test, int suraq) {
		this.test = test;
		this.suraq = suraq;	
	}
	
	
	public void output() {
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
	
		System.out.println("\n" + suraq + ". " + super.getText());
	
		char [] alp = {'A', 'B', 'C', 'D'};
	
		for (int i = 0; i < 4; i++) {
			System.out.println(alp[i] + ". " + outputQ(test.get(i + 1)));
		}
	
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
