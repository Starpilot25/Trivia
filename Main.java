import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



    }
    public class Quiz extends triviaQuestions {
        public Quiz(String q1, String q2, String q3, String q4, String q5, String q6, String q7,
                    String q8, String q9, String q10, String ans1, String ans2, String ans3,
                    String ans4, String ans5, String ans6, String ans7, String ans8, String ans9,
                    String ans10) {
            super(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, ans1, ans2, ans3, ans4,
                    ans5, ans6, ans7, ans8, ans9, ans10);
        }
        Scanner scanner = new Scanner(System.in);


    }
}

//step 1: make trivia quiz
//step 2: if you get one wrong, immediately throw an error
//step 3: if you get all of them right, it starts again. this process repeats until you get wrong,
//in which case step 2 will proceed