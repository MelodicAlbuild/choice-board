package com.melodicalbuild.board;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws NoSuchFieldException {
		String[] questions = {"What is your Name?", "What is your Grade?", "What does success look like to you in this class?", "What are your goals in relation to this class?", "What can your teacher do to make you feel welcome in class?", "How would you like your accomplishments to be celebrated?", "Tell us something new about yourself or something that not a lot of people know.", "Discuss your favorite or the coolest computer assignment you've ever done.", "What problem do you want to solve? This could be anything from a worldwide issue to something in your home, community, or school.", "Why do you think learning computer science skills are important?"};
		String[] answers = {"Alex", "10th", "Gaining the Ability to fluently code in Java (Guess what this is written in)", "Gain a better understanding for Javascript and how it works.", "Understand what I know and be able to use it.", "Just a simple well done is great.", "I don't usually Java, I am a frontend developer of 7 years.", "Design a Tower Defence Game in Python", "I want to solve the inability for Java code to run at high speeds without building to complete.", "Computer Science is what will push this world further and further. Knowing how it works will put you at the forefront of the jobs to come in following years."};
		Scanner myObj = new Scanner(System.in);
		Scanner myObs = new Scanner(System.in);
	    while(true) {
	    	try {
	    		System.out.println("Pick a Question. 1-10");
//		    	String yes = myObj.nextLine();
//		    	System.out.println(yes);
		    	int qX = Integer.valueOf(myObj.nextLine());
		    	int qI = qX - 1;
			    System.out.println("The question was: " + questions[qI]);
			    System.out.println("And my answer is: " + answers[qI]);
			    System.out.println(" ");
	    	} catch(Exception e) {
	    		throw new ArrayIndexOutOfBoundsException("Your Input is to big, Please use 1-10");
	    	}
	    		try {
	    			System.out.println("Would you like to choose another? Y/N");
				    char continueInput = myObs.next().charAt(0);
				    String sI = Character.toString(continueInput);
				    String basic = sI.toUpperCase();
				    char sIn = basic.charAt(0);
				    if (sIn == 'Y') {
				        continue;
				    } else if(sIn == 'N'){
				       System.out.println("Goodbye!");
				       break;
				    } else {
				    	throw new EmptyStackException();
				    }
	    		} catch(Exception e) {
	    			throw new NoSuchFieldException("Your input is not a Valid Answer, Please use Y or N");
	    		}
	    }
//		while (true) {
//		    System.out.println("Input positive numbers.");
//		    int number = Integer.valueOf(myObj.nextLine());
//
//		    if (number == 0) {
//		        break;
//		    }
//
//		    if (number < 0) {
//		        System.out.println("Unfit number! Try again.");
//		        continue;
//		    }
//
//		    System.out.println("Your input was " + number);
//		}
	}
}
