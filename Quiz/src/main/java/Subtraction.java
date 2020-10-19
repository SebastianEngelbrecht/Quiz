import java.util.Random;

public class Subtraction extends Quiz {

    public Subtraction() {
    this.options.add("1) giv mig et svært minusstykke");
    this.options.add("2) giv mig et let minusstykke");
    this.options.add("3) afslut");

    }
    protected void displayExercise() {
        System.out.println("What is "+number1+" - "+number2);
    }

        protected  int calculateResult(){
        return number1 - number2;
    }

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
}
