import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CURRENCY CONVERTER");
        System.out.print("ENTER THE AMOUNT IN INR: ");
        float inr = sc.nextFloat(); 

        System.out.println("\nTHE LIST OF CURRENCIES:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. JPY");
        System.out.println("4. PKR");
        System.out.println("5. WON");
        System.out.println("6. DIR");
        System.out.print("Enter currency code (e.g., USD, EUR): ");
        String curr = sc.next().toUpperCase(); 

        float conCur = 0; 

        
        switch (curr) {
            case "USD":
                conCur = inr / 86.56f;
                System.out.printf("Converted Amount: %.2f USD%n", conCur);
                break;
            case "EUR":
                conCur = inr / 90.25f;
                System.out.printf("Converted Amount: %.2f EUR%n", conCur);
                break;
            case "JPY":
                conCur = inr * 1.80f;
                System.out.printf("Converted Amount: %.2f JPY%n", conCur);
                break;
            case "PKR":
                conCur = inr * 3.00f;
                System.out.printf("Converted Amount: %.2f PKR%n", conCur);
                break;
            case "WON":
                conCur = inr * 16.70f;
                System.out.printf("Converted Amount: %.2f WON%n", conCur);
                break;
            case "DIR":
                conCur = inr * 0.042f;
                System.out.printf("Converted Amount: %.2f DIR%n", conCur);
                break;
            default:
                System.out.println("INVALID INPUT. PLEASE ENTER A VALID CURRENCY CODE.");
        }

      
    }
}
