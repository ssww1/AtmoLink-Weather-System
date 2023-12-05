import java.util.Scanner;
public class Driver {
    User user = new User();

    Administrator administrator = new Administrator();


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // to identify the visitors
        int enternumber;
        System.out.println("AtmoLink-Weather-System v1.0" +
                "Are you administrator or normal user?" +
                        "please enter 1 or 2, " +
                        "1 for administrator,2 for user"
                );
        enternumber = input.nextInt();
        if (enternumber == 2){
            user.applyRunmenu();
        }

    }
}
