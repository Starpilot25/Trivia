public class thrwErr extends Exception{
    public thrwErr(String message) {
        super(message);
    }


    private void checkAnswer(String userAnswer, String correctAnswer) throws thrwErr {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            throw new thrwErr("Incorrect. The correct answer is: " + correctAnswer);
        }
    }
}
