abstract class Question {
	String text, answer;
	
	public Question() {
	}
	
	public void setText(String text) {
		String d = "";
		for (int i = 3; i < text.length(); i++) {
			d += text.charAt(i);
		}
		
		this.text = d;
	} 
	
	public String getText() {
		String text = "";
		
		for (int i = 3; i < this.text.length(); i++) {
			text += this.text.charAt(i);
		}
		
		return text;
	}
	
	public void setAnswer(String answer) {
		String d = "";
		for (int i = 3; i < answer.length(); i++) {
			d += answer.charAt(i);
		}
		this.answer = d;
	}
	
	public String getAnswer() {
		String answer = "";
		for (int i = 3; i < this.answer.length(); i++) {
			answer += this.answer.charAt(i);
		}
		return answer;
	}
	
}
