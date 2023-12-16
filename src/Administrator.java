package src;
import java.text.MessageFormat;
import java.util.Objects;
import java.util.Scanner;

public class Administrator {
    java.util.Scanner input=new Scanner(System.in);
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

    public void StartMenu(){
        System.out.println("""
                Please enter the operation you want to perform:
                1. View data
                2. Modify data 
                3. Filter data 
                4. Delete data
                """);

        Scanner input=new Scanner(System.in);
        int intinput=input.nextInt();
        switch(intinput){
            case 1:ViewData();
            case 2:ModifyData();
            case 3:Filterdata();
            case 4:Deletedata();
        }
    }

    public void ViewData(){
        String Data=("""
                day1 {0} {1} {2} {3} {4}
                day2 {5} {6} {7} {8} {9}
                day3 {10} {11} {12} {13} {14}
                day4 {15} {16} {17} {18} {19}
                day5 {20} {21} {22} {23} {24}
                day6 {25} {26} {27} {28} {29}
                day7 {30} {31} {32} {33} {34}
                """);
        Data= MessageFormat.format(Data,w[0],t[0],h[0],W[0],b[0],w[1],t[1],h[1],W[1],b[1],w[2],t[2],h[2],W[2],b[2],w[3],t[3],h[3],W[3],b[3],w[4],t[4],h[4],W[4],b[4],w[5],t[5],h[5],W[5],b[5],w[6],t[6],h[6],W[6],b[6]);
        System.out.println(Data);
    }

    public void ModifyData(){
        System.out.println("Please enter the date");
        int date=input.nextInt();
        System.out.println("""
        Please enter the type of the data:
        1) weather
        2) temperature
        3) windforce
        4) humidity
        5) barometric
        0) Exit

        """);
        int datatype=input.nextInt();
        System.out.println("Please enter the result you want to modify");
        if(((datatype>=0)&&(datatype<=5))&&((date>=1)&&(date<=7))){
            switch(datatype){
                case 0:StartMenu();
                case 1:w[date-1]=input.toString();
                case 2:t[date-1]=input.nextDouble();
                case 3:W[date-1]=input.nextInt();
                case 4:h[date-1]=input.nextDouble();
                case 5:b[date-1]=input.toString();
            }



        }else{
            System.out.println("Invalid data entered, please try again");
            ModifyData();
        }

    }

    public void Filterdata(){
        System.out.println("""
        Please enter the type of the data you want to view and filter:
        1) weather
        2) temperature
        3) windforce
        4) humidity
        5) barometric
        0) Exit

        """);
        int datatype=input.nextInt();
        System.out.println("Please enter the result you want to filter");
        if((datatype>0)&&(datatype<6)){
        switch(datatype){
            case 0:StartMenu();
            case 1:{String data=input.toString();
                System.out.println("Dates that meet the filtering criteria are:");
                for (int i = 0; i < w.length; i++) {
                    if(Objects.equals(w[i], data)) {
                        System.out.println(i + 1);
                    }}}
            case 2:{double data=input.nextDouble();
                System.out.println("Dates that meet the filtering criteria are:");
                for (int i = 0; i < t.length; i++) {
                    if(Objects.equals(t[i], data)) {
                        System.out.println(i + 1);
                    }}}
            case 3:{int data=input.nextInt();
                System.out.println("Dates that meet the filtering criteria are:");
                for (int i = 0; i < W.length; i++) {
                    if(Objects.equals(W[i], data)) {
                        System.out.println(i + 1);
                    }}}
            case 4:{double data=input.nextDouble();
                System.out.println("Dates that meet the filtering criteria are:");
                for (int i = 0; i < h.length; i++) {
                    if(Objects.equals(h[i], data)) {
                        System.out.println(i + 1);
                    }}}
            case 5:{String data=input.toString();
                System.out.println("Dates that meet the filtering criteria are:");
                for (int i = 0; i < b.length; i++) {
                    if(Objects.equals(b[i], data)) {
                        System.out.println(i + 1);
                    }}}
            }

    }else{
            System.out.println("Invalid data entered, please try again");
            Filterdata();
        }

        }

    public void Deletedata() {
        System.out.println("Please enter the date");
        int date=input.nextInt();
        System.out.println("""
        Please enter the type of the data:
        1) weather
        2) temperature
        3) windforce
        4) humidity
        5) barometric
        0) Exit

        """);
        int datatype=input.nextInt();
        if(((datatype>=0)&&(datatype<=5))&&((date>=1)&&(date<=7))){
            switch(datatype){
                case 0:StartMenu();
                case 1:w[date-1]="default";
                case 2:t[date-1]=0;
                case 3:W[date-1]=0;
                case 4:h[date-1]=0;
                case 5:b[date-1]="default";
            }



        }else{
            System.out.println("Invalid data entered, please try again");
            Deletedata();

        }
    }
}

