import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


    abstract class Quiz {
    //number1 er altid det største tal af de to
    protected  int number1;
    protected  int number2;
    private  int correctAnswer;
    protected int mode;
    ArrayList<String> options = new ArrayList<>();




    public void startQuiz() {
        generateRandomNumbers();
        correctAnswer = calculateResult();
        displayExercise();
        play();

    }

    private void play(){
        int answer = promptForAnswer();
        displayResult(answer, correctAnswer);
    }
    private  void displayResult(int answer, int correct) {
        if(answer == correct){
            System.out.println("JA! Det var rigtigt");
            generateRandomNumbers();
            Main.showMenu();

        }else{
            System.out.println("NEJ. Det var forkert. Prøv igen.");
            play();
        }

    }

    private static int promptForAnswer() {
        Scanner scan = new Scanner(System.in);
        int userinput = scan.nextInt();
        return userinput;
    }

    abstract protected void displayExercise();

    abstract protected   int calculateResult();

    private void generateRandomNumbers() {
        Random r = new Random();
        int n1 = r.nextInt(10*mode)+1;//8
        int  n2 = r.nextInt(10*mode)+1;//9
        //Hvis det er n2 der er størst, så skal number1 sættes til n2
        if(n2 > n1) {
            number1 = n2;
            number2 = n1;
        }else{ //og omvendt
            number1 = n1;
            number2 = n2;
        }
    }

    public  int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        number1 = number1;
    }

    public  int getNumber2() {
        return number2;
    }

    public  void setNumber2(int number2) {
        number2 = number2;
    }

    public  int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        correctAnswer = correctAnswer;
    }


    public void setMode(int i) {
        this.mode = i;
    }


}



