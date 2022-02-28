public class InvalidQuizFormatException extends Exception {
	
	
	public InvalidQuizFormatException() {

	}

	public InvalidQuizFormatException(String answer) {
		this.answer = answer;
	}
		
}
