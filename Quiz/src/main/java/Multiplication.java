import java.util.Random;

public class Multiplication extends Quiz {
    public Multiplication() {
        this.options.add("1) giv mig et svært gangestykke");
        this.options.add("2) giv mig et let gangestykke");
        this.options.add("3) afslut");

    }

    protected  int calculateResult(){
        return number1 * number2;
    }
    protected void displayExercise() {
        System.out.println("What is "+number1+" * "+number2);
    }

    protected void generateRandomNumbers() {
        Random r = new Random();
        int n1 = r.nextInt(10*mode)+1;
        int  n2 = r.nextInt(10)+1;

    }
}
