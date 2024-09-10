import java.util.Scanner;

public class StudentScoresManager {
    private static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }

    // Method to find the highest score
    private static int findHighestScore(int[] scores) {
        int highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        return highest;
    }

    // Method to find the lowest score
    private static int findLowestScore(int[] scores) {
        int lowest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Define the number of students
        final int NUM_STUDENTS = 5;
        
        // Create an array to store the scores
        int[] scores = new int[NUM_STUDENTS];
        
        // Prompt user to enter scores
        System.out.println("Enter the scores for " + NUM_STUDENTS + " students:");

        // Read scores from user
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        
        
        // Calculate the average score
        double averageScore = calculateAverage(scores);
        
        // Find the highest score
        int highestScore = findHighestScore(scores);
        
        // Find the lowest score
        int lowestScore = findLowestScore(scores);
        
        // Print all the scores
        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        
        // Print the calculated average, highest, and lowest scores
        System.out.println("Average Score: " + averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        
        // Close the scanner
        scanner.close();
    }

    // Method to calculate the average score
    
}
