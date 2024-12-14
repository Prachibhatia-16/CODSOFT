package Codsoft; 
import java.util.*;
class Question { 
	public String questionText; 
	public String[] options; 
	public int answer; 
	public Question(String questionText, String[] options, int answer) { 
		this.questionText = questionText; 
		this.options = options; 
		this.answer = answer; 
		} 
	} 
public class Quiz_application_with_timer { 
	private int score = 0; 
	public boolean timeOut=false;
	public static void main(String[] args) { 
		new Quiz_application_with_timer().start();
	}
public void start() {
	ArrayList<Question> list = new ArrayList<>(); 
	list.add(new Question("What is the currency of USA?", new String[]{"1. Rupee", "2. Dollar", "3. Dinar", "4. Euro"}, 2)); 
	list.add(new Question("Which is the fastest animal on Earth?", new String[]{"1. Elephant", "2. Tiger", "3. Leopard", "4. Human"}, 3)); 
	list.add(new Question("What is the capital of France?", new String[]{"1. Paris", "2. London", "3. Berlin", "4. Madrid"}, 1)); 
	System.out.println("Welcome to our Quiz!"); 
	System.out.println("You will have ten seconds to answer each question"); 
	Scanner scanner = new Scanner(System.in); 
	for (int i = 0; i < list.size(); i++) { 
		boolean answered = false; 
		int result = 0; 
		
		System.out.println("Question " + (i + 1) + ": " + list.get(i).questionText); 
		timeOut = false; 
		for (String m : list.get(i).options) { 
			System.out.println(m); 
			} 
		Timer timer=new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				timeOut=true;
				System.out.println("Time's Up!");
			}
		},10000);
		
		while (!answered && !timeOut) { 
			
			if (scanner.hasNextInt()) { 
				result = scanner.nextInt(); 
				answered = true; 
				} else { 
					scanner.next(); 
					System.out.println("Invalid input, please enter a number."); 
					} 
			if(timeOut) {
				break;
			
			}
		}
		timer.cancel();
			if(timeOut) {
			continue; 
			
		}
		else if (result == list.get(i).answer) { 
			System.out.println("Correct answer!"); 
			score++; 
			} 
		else if (result != 0) { 
			System.out.println("Incorrect answer. The correct answer was " + list.get(i).answer); 
			} 
		} 
	scanner.close(); 
	System.out.println("Your score is: " + score); 
	} 
}
