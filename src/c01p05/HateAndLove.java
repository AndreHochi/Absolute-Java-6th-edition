package c01p05;

public class HateAndLove {

	public static void main(String[] args) {
		
		String speech = "hate. let me tell you how much i have become to hate you as i began to live.";
		
		System.out.println("From the sentence, " + speech);		
		speech = speech.replace("hate", "love");
		System.out.println("We now have, " + speech);
		
	}

}
