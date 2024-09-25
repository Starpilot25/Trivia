import java.util.Scanner;

public class Quiz {
    private triviaQuestions questions;

    public Quiz(triviaQuestions questions) {
        this.questions = questions;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

       try{ System.out.println("Welcome to the Trivia Quiz!");
        System.out.println("Answer the following questions:");

        System.out.println("Question 1: " + questions.getQ1());
        checkAnswer(scanner.nextLine(), questions.getAns1());

        System.out.println(" ");

        System.out.println("Question 2: " + questions.getQ2());
        checkAnswer(scanner.nextLine(), questions.getAns2());

        System.out.println(" ");

        System.out.println("Question 3: " + questions.getQ3());
        checkAnswer(scanner.nextLine(), questions.getAns3());

        System.out.println(" ");

        System.out.println("Question 4: " + questions.getQ4());
        checkAnswer(scanner.nextLine(), questions.getAns4());

        System.out.println(" ");

        System.out.println("Question 5: " + questions.getQ5());
        checkAnswer(scanner.nextLine(), questions.getAns5());

        System.out.println(" ");

        System.out.println("Question 6: " + questions.getQ6());
        checkAnswer(scanner.nextLine(), questions.getAns6());

        System.out.println(" ");

        System.out.println("Question 7: " + questions.getQ7());
        checkAnswer(scanner.nextLine(), questions.getAns7());

        System.out.println(" ");

        System.out.println("Question 8: " + questions.getQ8());
        checkAnswer(scanner.nextLine(), questions.getAns8());

        System.out.println(" ");

        System.out.println("Question 9: " + questions.getQ9());
        checkAnswer(scanner.nextLine(), questions.getAns9());

        System.out.println(" ");

        System.out.println("Question 10: " + questions.getQ10());
        checkAnswer(scanner.nextLine(), questions.getAns10());

       } catch (thrwErr e) {
           System.out.println(e.getMessage());
    } finally {
        scanner.close();
    }
}



    private void checkAnswer(String userAnswer, String correctAnswer) throws thrwErr {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is: " + correctAnswer);
        }
    }

    public static void main(String[] args) throws thrwErr {
        // Create a triviaQuestions object with questions and answers
        triviaQuestions questions = new triviaQuestions();

        // Create a Quiz object with the triviaQuestions object
        Quiz quiz = new Quiz(questions);

        // Start the quiz
        quiz.startQuiz();
    }
}
