import java.util.Scanner;
public class Driver {

//main codes to run the whole app
public static void main(String[] args) {
        //initialize the objects
        User user = new User();
        Administrator administrator = new Administrator();
        int enternumber;
        Scanner input = new Scanner(System.in);
        // to identify the visitors
            System.out.println("AtmoLink-Weather-System v1.0" +
                    "Are you administrator or normal user?" +
                    "please enter 1 or 2, " +
                    "1 for administrator,2 for user"
            );
            enternumber = input.nextInt();
        if (enternumber == 2) {
            user.runmenu();
        }
        else {

        }
    }
}
