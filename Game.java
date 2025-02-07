import java.util.Scanner;

class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rNum;
        do {
            rNum = (int) (Math.random() * 10); 
        } while (rNum < 1 || rNum > 3); 
        String codeOpt = null;
        if (rNum == 1) {
            codeOpt = "STONE";
        } else if (rNum == 2) {
            codeOpt = "PAPER";
        } else if (rNum == 3) {
            codeOpt = "SCISSOR";
        }

        
        System.out.println();
        System.out.println("---------WELCOME----------");
        System.out.println();
        System.out.println("Choose an option:");
        System.out.println("1. STONE  2. PAPER  3. SCISSOR");
        
        
        System.out.print("Enter your choice (1-3): ");
        int opt = sc.nextInt();

        String userOpt = null;
        if (opt == 1) {
            userOpt = "STONE";
        } else if (opt == 2) {
            userOpt = "PAPER";
        } else if (opt == 3) {
            userOpt = "SCISSOR";
        } else {
            System.out.println("INVALID INPUT!! Please enter 1, 2, or 3.");
            sc.close();
            return;
        }

        
        System.out.println("USER: " + userOpt + "  |  BOT: " + codeOpt);

       
        if ((opt == 1 && rNum == 3) || (opt == 2 && rNum == 1) || (opt == 3 && rNum == 2)) {
            System.out.println("USER WINS!!!");
        } else if ((opt == 1 && rNum == 2) || (opt == 2 && rNum == 3) || (opt == 3 && rNum == 1)) {
            System.out.println("BOT WINS!!!");
        } else {
            System.out.println("DRAW");
        }

        sc.close(); // Closing Scanner
    }
}
