package test;

import java.util.Scanner;
//Class for reading test
public class Reading {
	//Instance variable to hold test level
	private String level;
	//Instance varialbe to hold test score
	private int score;
	//Instance variable to hold grade equivalency
	private double gradeEquivalency;
	
	//Instantiate Scanner object for user input
	Scanner input = new Scanner(System.in);
	
	//Method to return level
	public String getLevel() {
		return level;
	}
	//Method to set level
	public void setLevel(String level) {
		this.level = level;
	}
	//Method to return score
	public int getScore() {
		return score;
	}
	//Method to set score
	public void setScore(int score) {
		this.score = score;
	}
	//Method to return grade equivalency
	public double getGradeEquivalency() {
		return gradeEquivalency;
	}
	
	//Method that takes a level input and outputs the student's grade equivalency based on the level input and student's score
	public void runTest(String level) {
		//Sets instance variable to level input
		this.level = level;
		//In case of test level E
		switch (this.level){
		case "E":
			//array containing  possible grade equivalencies.
			double[] arrayE = {0, 0, 0, 0, 0, 0, 0, 0.8, 1.6, 1.8, 2.0, 2.1, 2.3, 2.6, 3.0, 3.3, 3.8, 4.1, 4.5, 5.0, 5.3, 5.8, 6.3, 6.9, 6.9, 6.9};
			//prompt user to input to the system how many questions the student answered correctly
			System.out.println("Input number correct.");
			//variable containing the user input
			int numberCorrectE = input.nextInt();
			//set Grade Equivalency to the double stored in arrayE that corresponds to the number correct
			gradeEquivalency = arrayE[numberCorrectE];
			//output grade equivalency
			System.out.println("Reading grade equivalency is: " + gradeEquivalency + ".");
			break;
		//In case of test level M
		case"M":
			double[] arrayM = {0, 0, 0, 0, 0, 0, 1.9, 2.3, 2.5, 2.8, 3.2, 3.5, 3.9, 4.1, 4.5, 4.8, 5.1, 5.4, 5.7, 6.1, 6.6, 7.6, 8.5, 9.6, 9.9, 9.9};
			System.out.println("Input number correct.");
			int numberCorrectM = input.nextInt();
			gradeEquivalency = arrayM[numberCorrectM];
			System.out.println("Reading grade equivalency is: " + gradeEquivalency + ".");
			break;
		//In case of test level D	
		case"D":
			double[] arrayD = {0.7, 0.7, 0.7, 0.7, 0.7, 0.7, 1.7, 2.2, 2.6, 3.2, 3.6, 4.1, 4.5, 5.0, 5.4, 5.9, 6.4, 7.4, 8.2, 9.1, 10.5, 11.2, 12.9, 12.9, 12.9, 12.9}; 
			System.out.println("Input number correct.");
			int numberCorrectD = input.nextInt();
			gradeEquivalency = arrayD[numberCorrectD];
			System.out.println("Reading grade equivalency is: " + gradeEquivalency + ".");
			break;
		//In case of test level A
		case"A":
			double[] arrayA = {1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.6, 2.2, 2.7, 3.4, 4.0, 4.6, 5.2, 5.6, 6.0, 6.6, 7.6, 8.3, 9.1, 10.0, 11.1, 12.9, 12.9, 12.9, 12.9, 12.9}; 
			System.out.println("Input number correct.");
			int numberCorrectA = input.nextInt();
			gradeEquivalency = arrayA[numberCorrectA];
			System.out.println("Reading grade equivalency is: " + gradeEquivalency + ".");
			break;
		}	
	}
}
