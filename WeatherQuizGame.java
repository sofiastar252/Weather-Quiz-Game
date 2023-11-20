import java.util.Scanner;

public class WeatherQuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Weather Quiz Game!");

        int score = 0;
        String[] questions = {
                "What is the unit of measurement for temperature?",
                "Which gas makes up the majority of Earth's atmosphere?",
                "At what temperature does water boil in Celsius?",
                "What is the process by which water vapor turns into liquid water?",
                "Which instrument is used to measure wind speed?"
        };

        String[] answers = {"Celsius", "Nitrogen", "100 degrees", "Condensation", "Anemometer"};

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct! +1 point\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz complete! Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
