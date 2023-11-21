import java.util.Scanner;

public class User extends SourceDataBase {
    private int date;
    private int kindOfData;
    public void setDate(int date) {
        this.date = date;
    }
    public int getDate() {
        return date;
    }
    public void setKindOfData(int kindOfData) {
        this.kindOfData = kindOfData;
    }
    public int getKindOfData() {
        return kindOfData;
    }

   //main mneu of the user
    private int mainMenu() {
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("AtmoLink-Weather-System v1.0");
        System.out.println("\nPress enter key to continue...");
        input.nextLine();
        input.nextLine();
        System.out.print("""
                consultant menu
                ---------
                   1) day1
                   2) day2
                   3) day3
                   4) day4
                   5) day5
                   6) day6
                   7) day7
                   0) Exit  
                ==>> """);
        int date = input.nextInt();
        System.out.println("""
                 consultant menu
                 -----------------
                   1) weather
                   2) temperature
                   3) windforce
                   4) humidity
                   5) barometric
                   0) Exit   
                """);
        int kindOfData = input.nextInt();
        return kindOfData & date;
    }

    private void runmenu() {
        java.util.Scanner input = new Scanner(System.in);
        //creat objects
        kindOfData = mainMenu();
        date = mainMenu();
        Weather weather =new Weather();
        Temperature temperature =new Temperature();
        Windforce windforce =new Windforce();
        Humidity humidity = new Humidity();
        Barometric barometric = new Barometric();

        String[] w = weather.getWeather();
        double [] t = temperature.getTemperature();
        int[] W = windforce.getWindforce();
        double[] h = humidity.getHumidity();
        String[] b = barometric.getBarometric();

        while(date != 0 & kindOfData != 0) {
            if (date <= 7) {
                switch (kindOfData) {
                    case 1 -> System.out.println(w[date - 1]);
                    case 2 -> System.out.println(t[date - 1]);
                    case 3 -> System.out.println(w[date - 1]);
                    case 4 -> System.out.println(h[date - 1]);
                    case 5 -> System.out.println(b[date - 1]);
                    default -> System.out.println("Invalid number entered: " + kindOfData);
                }
            } else {
                System.out.println("Invalid date entered:" + date);
            }
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine();
            kindOfData = mainMenu();
            date = mainMenu();
        }
        System.out.println("Exiting....Goodbye!");
        System.exit(0);

    }
}










