import java.util.Scanner;

class VowelPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        
        
        System.out.print("Vowels in username: ");
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
         
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.print(ch + " ");
            }
        }
        
    }
}
