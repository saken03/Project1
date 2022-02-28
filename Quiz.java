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
			char c = text.get(i).charAt(1);
			
			if (c == 't') {
				ArrayList<String> qq = new ArrayList<String>();
				for (int j = i; j <= i + 4; j++) {
					qq.add(text.get(j));
				}
				i = i + 4;
				questions.add(qq);
			}
			else {
				ArrayList<String> qq;
				qq.add(text.get(i));
				i++;
				qq.add(text.get(i));
				questions.add(qq);
			}
		}
	}
	
	public void start() {
		questions = shuffle();
		
		for (int i = 0; i < questions.size(); i++) {
			char type = questions.get(i).get(0).charAt(1);
			
			if (type == 't') {
					
			}
			else if (type == 'f') {
			}
		}
	}
	
}
/*
static public static void Check_Question(String s) throws InvalidQuizFormatException {
		char c = s.charAt(1);
		if (!(c == 't' || c == 'f' || c == 'a')) throw new InvalidQuizFormatException;
}
*/

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
