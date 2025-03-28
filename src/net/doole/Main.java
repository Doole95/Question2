package net.doole;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] questions = new String[5];
        questions[0] = "How many fingers do humans have?";
        questions[1] = "What is the capital of England?";
        questions[2] = "What colour is the sky?";
        questions[3] = "What colour is the grass?";
        questions[4] = "What is the colour of a banana";

        String[] answers = new String[5];
        answers[0] = "8";
        answers[1] = "London";
        answers[2] = "Blue";
        answers[3] = "Green";
        answers[4] = "Yellow";

        Scanner scanner = new Scanner(System.in);
        int score = 0;


        while(true) {
            printTile();

            for(int counter = 0; counter < questions.length; counter++) {
                printQuestion(questions[counter]);
                String userAnswer = scanner.next();

                if(isCorrect(userAnswer,answers[counter])) {
                    printCorrectAnswer(answers[counter]);
                    score = addScore(score);
                    getScore(score);

                }else {
                    answerWrong(answers[counter]);
                    playAgain();
                    if (scanner.next().equals("Y")) {
                        score = 0;
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }







    }

    public static void printTile(){
        System.out.println("Doole's Question time");
    }

    public static void getScore(int score){
        System.out.println("Current Score is: " + score);
    }

    public static void  printQuestion(String question) {
        System.out.println(question);
    }

    public  static boolean isCorrect(String userAnswer, String realAnswer){
        return userAnswer.equals(realAnswer);
    }

    public static void printCorrectAnswer(String answer){
        System.out.println(answer);
    }

    public static int addScore(int score){
        score = score + 1;
        return score;
    }

    public static void answerWrong(String answer) {
        System.out.println("Incorrect, the real answer is:" + answer );
    }

    public static void playAgain(){
        System.out.println("Do you want to play again? Y/N");
    }


}
