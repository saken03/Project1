import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;

public class Quiz {
	static ArrayList<String> text = new ArrayList<String>();
	static ArrayList<ArrayList<String>> questions = new ArrayList<ArrayList<String>>();
	
	public Quiz() {
	}
	
	public static void loadQues() {
		try {
			File file = new File("jQuiz.txt");
			Scanner fileReader = new Scanner(file);
		
			while (fileReader.hasNextLine()) {
				String ques = fileReader.nextLine();
				text.add(ques);
			}
			fileReader.close();
		} catch(FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
		}
		
		for (int i = 0; i < text.size(); i++) {
			if (text.get(i).length() < 1) continue;
			
			char c = text.get(i).charAt(1);
			ArrayList<String> qq = new ArrayList<String>();	
			
			if (c == 't') {
				for (int j = i; j <= text.size() && j <= i + 4; j++) {
					qq.add(text.get(j));
				}
				i = i + 4;
				questions.add(qq);
			}
			else {
				qq.add(text.get(i));
				i++;
				qq.add(text.get(i));
				questions.add(qq);
			}
		}

	}
	
	public void start() {
		int result = 0;
		
		questions = shuffle();
		
		for (int i = 0; i < questions.size(); i++) {
			char type = questions.get(i).get(0).charAt(1);
			
			for (int a = 0; a < questions.size(); a++) {
				for (int b = 0; b < questions.get(a).size(); b++) {
					System.out.print(questions.get(a).get(b) + ' ');
				}
				System.out.println();
			}
			
			break;
			
		/*	if (type == 't') {
					Test test = new Test(questions.get(i), i + 1);
					
					test.setText(questions.get(i).get(0));
			
					for (int j = 0; j < questions.get(i).size(); j++) {
						if (questions.get(i).get(j).charAt(1) == 'c') {
							test.setAnswer(questions.get(i).get(j));
						}
					}
			
					test.output();
			
					System.out.print("\nEnter the correct choice: ");
		
		
					Scanner in = new Scanner(System.in);
					
					char choice = in.next().charAt(0);
					int ans = 2;
					
					if (choice == 'A') ans = 1;
					else if (choice == 'B') ans = 2;
					else if (choice == 'C') ans = 3;
					else if (choice == 'D') ans = 4;
					else {
						System.out.println("Invalid answer!!!");
						i--;
						continue;
					}
					
					
					if (test.getAnswer().equals(questions.get(i).get(ans - 1))) {
						// Correct
						result += 1;
						System.out.println("Correct answer!");
					}
					else {
						System.out.println("Incorrect answer.");
					}
			}
			else { // Fillin quesion type
				FillIn fillin = new FillIn(questions.get(i), i + 1);
				
				fillin.setText(questions.get(i).get(0));
				fillin.setAnswer(questions.get(i).get(1));
			
				fillin.output();
			
				System.out.print("\nEnter the correct choice: ");
				Scanner in = new Scanner(System.in);
				
				String answer = in.nextLine();
				
				if (fillin.getAnswer().equals(answer)) {
					//Correct
					result += 1;
					System.out.println("Correct answer!");
				}
				else {
					System.out.println("Incorrect answer!");
				}
			}*/
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.print('-');
		}
		
		System.out.println('\n' + result);
	}
	
	public ArrayList<ArrayList<String>> shuffle() {	
			
			ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
			for (int i = 0; i < questions.size(); i += 2) {
			
				ArrayList<String> tmp = new ArrayList<String>();
			
				for (int j = 0; j < questions.get(i).size(); j += 2) {
					tmp.add(questions.get(i).get(j));
				}
			
				for (int j = 1; j < questions.get(i).size(); j += 2) {
					tmp.add(questions.get(i).get(j));
				}
				
				temp.add(tmp);
			}
			for (int i = 1; i < questions.size(); i += 2) {
			
				ArrayList<String> tmp = new ArrayList<String>();
			
				for (int j = 0; j < questions.get(i).size(); j += 2) {
					tmp.add(questions.get(i).get(j));
				}	
			
				for (int j = 1; j < questions.get(i).size(); j += 2) {
					tmp.add(questions.get(i).get(j));
				}
				
				temp.add(tmp);
			}
		
		
			return temp;
	}

	}
/*  prototipe. Azirwe exception-siz
static public static void Check_Question(String s) throws InvalidQuizFormatException {
		char c = s.charAt(1);
		if (!(c == 't' || c == 'f' || c == 'a')) throw new InvalidQuizFormatException;
}
*/
