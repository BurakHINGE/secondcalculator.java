import java.util.Scanner;

public class SecondCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int enteredSeconds = input.nextInt();
    
        int minutes = enteredSeconds / 60;
        int remainingSeconds = enteredSeconds % 60;

        System.out.println(enteredSeconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
    }
}
