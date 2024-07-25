

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Ask the user for their height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate the BMI
        double bmi = calculateBMI(weight, height);

        // Display the BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Display the BMI category
        System.out.println("You are " + getBMICategory(bmi));

        // Close the scanner
        scanner.close();
    }

    // Method to calculate BMI
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to get BMI category
    private static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "overweight";
        } else {
            return "obese";
        }
    }
}

