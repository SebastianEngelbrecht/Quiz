import java.util.Scanner;

public class Main {

    static Quiz quiz;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        quiz = new Subtraction();
        showMenu();
        quiz = new Multiplication();
        showMenu();
        System.out.println("Ses");


    }

    public static void showMenu(){
        System.out.println(quiz.options.get(0));
        System.out.println(quiz.options.get(1));
        System.out.println(quiz.options.get(2));
        boolean finished = false;
        while(!finished){

            String choice = scan.nextLine();

            switch (choice){
                case "1":
                    quiz.setMode(10);
                    quiz.startQuiz();
                case "2":
                    quiz.setMode(1);
                    quiz.startQuiz();
                break;

                case "3": finished = true;
                break;

            }
        }
    }
}
