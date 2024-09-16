import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       //declares scanner
        Scanner scanner = new Scanner(System.in);
//print statement 
        System.out.println("Enter the subtotal and a gratuity rate:");
//Pulls first variable
        double total = scanner.nextInt();
//Pulls second variable
        double gratuityrate = scanner.nextInt();
//Calculates gratuity
        double gratuity = total*(gratuityrate/100);
//Adds both together
        double newtotal = total+ gratuity;
        System.out.println("The gratuity is $"+gratuity+" and total is $"+ newtotal);

    }
}
