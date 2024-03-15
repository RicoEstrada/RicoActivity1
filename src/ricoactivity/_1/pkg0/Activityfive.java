package ricoactivity._1.pkg0;
import java.util.Scanner;

public class Activityfive {
    public static void main (String[] args){
        
        double amount;
        String sourceCurrency, targetCurrency;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        amount = scn.nextDouble(); 
        
        System.out.println("Enter the Source Currency (USD, PESO, YEN): ");
        sourceCurrency = scn.next().toUpperCase();
        
        System.out.println("Enter the Target Currency (USD, PESO, YEN): ");
        targetCurrency = scn.next().toUpperCase();
        
        double convertionrate = 0;
        switch (sourceCurrency){
            case "USD":
                switch (targetCurrency){
                    case "PESO":
                        convertionrate = 56.03;
                        break;
                    case "YEN":
                        convertionrate = 150.36;
                        break;
                }
                break;
            case "PESO" :
                switch (targetCurrency){
                    case "USD":
                        convertionrate = 0.018;
                        break;
                    case "YEN":
                        convertionrate = 2.68;
                        break;
                }
                break;
            case "YEN":  
                switch (targetCurrency){
                    case "USD":
                        convertionrate = 0.0067;
                        break;
                    case "PESO":
                        convertionrate = 0.37;
                        break;   
                }
                break;
        }
        double convertedAmount = amount * convertionrate;
        System.out.printf("The converted amount is: %.2f %s%n", convertedAmount, targetCurrency);
    }
}
