package src;

import java.util.Scanner;

public class Login {
    String username;
    String[] users = new String[10];
    String[] passwords = new String[10];

    public void getUsername() {
        this.username = Userlogin();
    }

    //give initial user's name and user's password
    public void InitializeDatabase() {

        users[0] = "Administrator";
        passwords[0] = "1234";

        users[1] = "User";
        passwords[1] = "0000";
    }

    public String Userlogin() {
        InitializeDatabase();

        String result = "log in failed";
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your username:" + "(please enter Administrator or User)");
            String enteredUsername = input.next();

            System.out.println("Please enter your password:" + "(it should include 4 characters)");
            String password = input.next();

            for (int i = 0; i < 10; i++) {
                if (enteredUsername.equals(users[i]) && password.equals(passwords[i])) {
                    result = enteredUsername;
                    break;//to break out of the loop
                }
            }

            if (!result.equals("log in failed")){
                break;//break out of the while loop
            }
            System.out.println("User name or password wrong, please try again");
        }
        return result;
    }
}





