import java.util.Scanner;

public class eng_SecondsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int enteredSeconds = input.nextInt();
    
        int hours = enteredSeconds / 3600;
        int remainingSecondsAfterHours = enteredSeconds % 3600;
        int minutes = remainingSecondsAfterHours / 60;
        int remainingSecondsAfterMinutes = remainingSecondsAfterHours % 60;
        int remainingSeconds = remainingSecondsAfterMinutes;
        
        System.out.println(enteredSeconds + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + remainingSeconds + " seconds.");
    }
}
