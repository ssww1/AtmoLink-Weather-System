import java.util.Scanner;
public class Driver {

    //main codes to run the whole app
    public static void main(String[] args) {
        System.out.println("AtmoLink-Weather-System v1.0");

        //initialize the objects
        User user = new User();
        Administrator administrator = new Administrator();
        Login login = new Login();


        login.getUsername();

        if (login.username.equals("User")){
            user.runmenu();
        } else if (login.username.equals("Administrator")) {
            administrator.StartMenu();
        }
    }
}
