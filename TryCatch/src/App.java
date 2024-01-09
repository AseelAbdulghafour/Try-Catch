import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";
        
        int attempts = 3;

        while(attempts > 0){
            System.out.println("Enter your username: ");
            String inputUsername = scan.next();

            System.out.println("Enter your password: ");
            String inputPassword = scan.next();
        
        try {

            if (!inputUsername.equals(validUsername) || !inputPassword.equals(validPassword)) {
                throw new Exception("Please, Try Again");
            }
            else{
                System.out.println("Signed in successfully");
                break;
            }
            

        } catch (Exception e) {
            System.out.println("Invalid credentials" + e.getMessage());
            attempts--;
            System.out.println("Attempts left " + attempts);
        }
       
    }
     scan.close();
}
}