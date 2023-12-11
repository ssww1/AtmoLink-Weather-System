package src;

import java.util.Scanner;

public class Login {
    String[] users=new String[10];
    String[] passwords=new String[10];

    public void InitializeDatabase(){

        users[0]="Administrator";
        passwords[0]="1234";
    }

    public String Userlogin(){
        InitializeDatabase();

        String result;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username=input.toString();
        System.out.println("Please enter your password:");
        String password=input.toString();

        for (int i = 0; i < 10; i++) {
            if(username.equals(users[i])){
                if(password.equals(passwords[i])){
                    result=username;
                    return result;
                }else{
                    System.out.println("password incorrect");
                    System.out.println("login failed");
                    Userlogin();
                }
            }

        }
        System.out.println("user not found");
        result="login failed";
        Userlogin();
        return result;
    }
}

