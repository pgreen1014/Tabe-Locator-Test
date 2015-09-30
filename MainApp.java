import test.*;
import test.Math;
import java.util.Scanner;

import test.Reading;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Loop through three times in order to score all three tests
		for (int i = 0; i < 3; i++) {
			//prompt the user to choose to grade Reading, Math or Language
			System.out.println("Input a subject: Reading, Math, or Language.");
			//save user input to subject
			String subject = input.nextLine();
			//Convert user input to lower case
			subject.toLowerCase();
			
			//Switch based on subject
			switch (subject) {
			//In the case of reading
			case "reading":
				//Instantiate a Reading object
				Reading testReading = new Reading();
				//Prompt user to chose test level
				System.out.println("Input a Reading level: E, M, D, or A");
				//save user input to level
				String level = input.nextLine();
				//set object reading level
				testReading.setLevel(level);
				//set object reading level
				testReading.runTest(level);
				break;
			//In the case of language
			case "language":
				Language testLanguage = new Language();
				System.out.println("Input a Language level: E, M, D, or A");
				String level1 = input.nextLine();
				testLanguage.setLevel(level1);
				testLanguage.runTest(level1);
				break;
			//In the case of math
			case "math":
				Math testMath = new Math();
				System.out.println("Input a Math level: E, M, D, or A");
				String level2 = input.nextLine();
				testMath.setLevel(level2);
				testMath.runTest(level2);
				break;
			}
		}

	}
}
