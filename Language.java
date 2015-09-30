package test;

//Import for Scanner Class
import java.util.Scanner;

//Class for Language Test
public class Language {
	//Instance variable to hold test level
	private String level; 
	//Instance variable to hold test score result
	private int score;
	//Instance variable to hold Grade Equivalency
	private double gradeEquivalency;
	
	//Instantiate Scanner object for user input
	Scanner input = new Scanner(System.in);
	
	//Method to set level
	public void setLevel(String level){
		this.level = level;
	}
	//Method to return test level
	public String getLevel(){
		return level;
	}
	//Method to set test score
	public void setScore(int score){
		this.score = score;
	}
	//Method to return test score
	public int getScore(){
		return score;
	}
	
	//Method that takes a level input and outputs the student's grade equivalency based on the level input and student's score
	public void runTest(String level){
		//sets instance variable to level input
		this.level = level;
		//Switch based on level
		switch(this.level){
		//In the case of test level E
		case"E":
			//array containing  possible grade equivalencies. 
			double[] arrayE = {0, 0, 0, 0, 0, 0, 1.2, 1.6, 1.9, 2.1, 2.3, 2.5, 2.7, 2.9, 2.9, 3.1, 3.4, 3.6, 4.1, 4.7, 5.2, 5.9, 6.7, 6.9, 6.9, 6.9}; 
			//prompt user to input to the system how many questions the student answered correctly
			System.out.println("Input number correct.");
			//variable containing the user input
			int numberCorrectE = input.nextInt();
			//set Grade Equivalency to the double stored in arrayE that corresponds to the number correct
			gradeEquivalency = arrayE[numberCorrectE];
			//output grade equivalency 
			System.out.println("Language grade equivalency is: " + gradeEquivalency + ".");
			break;
		//In the case of test level M	
		case"M":
			double[] arrayM = {0.6, 0.6, 0.6, 0.6, 0.6, 0.6, 1.4, 1.8, 2.0, 2.3, 2.6, 2.8, 2.9, 3.2, 3.5, 4.0, 4.7, 5.4, 6.2, 7.4, 8.8, 9.9, 9.9, 9.9, 9.9, 9.9}; 
			System.out.println("Input number correct.");
			int numberCorrectM = input.nextInt();
			gradeEquivalency = arrayM[numberCorrectM];
			System.out.println("Language grade equivalency is: " + gradeEquivalency + ".");
			break;
		//In the case of test level D	
		case"D":
			double[] arrayD = {1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.3, 1.8, 2.1, 2.4, 2.7, 2.9, 3.2, 3.5, 4.2, 4.8, 5.6, 6.3, 7.4, 8.4, 9.7, 10.7, 12.1, 12.9, 12.9, 12.9}; 
			System.out.println("Input number correct.");
			int numberCorrectD = input.nextInt();
			gradeEquivalency = arrayD[numberCorrectD];
			System.out.println("Language grade equivalency is: " + gradeEquivalency + ".");
			break;
		//In the case of level A
		case"A":
			double[] arrayA = {1.4, 1.4, 1.4, 1.4, 1.4, 1.4, 1.4, 2.0, 2.4, 2.7, 2.9, 3.2, 3.5, 4.2, 5.0, 5.6, 6.5, 7.7, 8.8, 10.0, 11.0, 12.5, 12.9, 12.9, 12.9, 12.9};
			System.out.println("Input number correct.");
			int numberCorrectA = input.nextInt();
			gradeEquivalency = arrayA[numberCorrectA];
			System.out.println("Language grade equivalency is: " + gradeEquivalency + ".");
			break;
		}
	}
}
