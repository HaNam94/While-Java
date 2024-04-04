import java.util.Scanner;

public class Interest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interesRate = 1.0;
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of month: ");
        month = input.nextInt();
        System.out.println("Enter annaual interest rate in percentage: ");
        interesRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interesRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
