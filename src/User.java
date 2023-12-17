package src;

import java.util.Scanner;

public class User extends Assessment{
    //initialize the object

    //declaring values
    private int date;
    private int kindOfData;

    //get and set methods
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


    public static int mainMenu() {
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("\nPress enter key to continue...");
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
                ==>>""");
         int date = input.nextInt() ;
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
        return  date;
    }

    public void runmenu() {
        java.util.Scanner input = new Scanner(System.in);
        // objects(pretend to use the arrays from  database)
         kindOfData = mainMenu();
         date = mainMenu();
        Weather weather =new Weather();
        Temperature temperature =new Temperature();
        Windforce windforce =new Windforce();
        Humidity humidity = new Humidity();
        Barometric barometric = new Barometric();

        //obtain the arrays
        String[] w = weather.getWeather();
        double [] t = temperature.getTemperature();
        int[] W = windforce.getWindforce();
        double[] h = humidity.getHumidity();
        String[] b = barometric.getBarometric();

        while(date != 0 && kindOfData != 0) {
            if (date <= 7) {
                switch (kindOfData) {
                    case 1 -> System.out.println("The weather is"+w[date - 1]);
                    case 2 -> System.out.println("The temperature is about" + t[date - 1] + "degrees");
                    case 3 -> System.out.println("The wind force is about level" + W[date - 1]);
                    case 4 -> System.out.println("The humidity of the air is about " + h[date - 1] + "%");
                    case 5 -> System.out.println("The barometric of the air is about" + b[date - 1]);
                    default -> System.out.println("Invalid number entered: " + kindOfData);
                }
            }
            else {
                System.out.println("Invalid date entered:" + date);
            }
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            date = kindOfData = mainMenu();

        }

        Assessment assessment = new Assessment();
        assessment.GetRecommendation(date);
        System.out.println("Exiting....Goodbye!");
        System.exit(0);
    }
}








