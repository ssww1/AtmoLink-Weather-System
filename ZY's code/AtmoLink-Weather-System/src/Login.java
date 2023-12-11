import java.util.Scanner;

public class Login {
    String username;
    String[] users=new String[10];
    String[] passwords=new String[10];
    public void getUsername(){
         this.username = Userlogin();
    }
    //give initial user's name and user's password
    public void InitializeDatabase(){

        users[0]="Administrator";
        passwords[0]="1234";

        users[1]="User";
        passwords[1]="0000";
    }

    public String Userlogin(){
        InitializeDatabase();

        String result = "login failed";
        boolean isValid = false;
        Scanner input=new Scanner(System.in);

        while(!isValid){
            System.out.println("Please enter your username:" + "(please enter Administrator of User)");
            String username=input.next();

            System.out.println("Please enter your password:"+ "(it should be include 4 words)");
            String password=input.next();

            for (int i = 0; i < 10; i++) {
                if(username.equals(users[i] )&&password.equals(passwords[i])){
                   result = username;
                   isValid = true;       //exit the while loop
                   break;                //exit the for loop
                }
            }
            System.out.println("User name or password wrong , please try again");
        }
        return result;
    }



}

