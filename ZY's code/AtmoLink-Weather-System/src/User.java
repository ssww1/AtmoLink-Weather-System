import java.util.Scanner;
public class User extends SourceDataBase {
    int date;
    int kindOfData;
    public void Userimplementationinterface(){
            System.out.println("AtmoLink-Weather-System v1.0");
            System.out.println("Please press enter to continue");
            java.util.Scanner input = new Scanner(System.in);


        }
    public void acquireData(){

        //get the date
        System.out.println("Please enter the data you want to consult,you should enter number from 1 to 7");
        java.util.Scanner input = new Scanner(System.in);
        int date = input.nextInt();
        //get the kind of data user wants to geet
        System.out.println("Please enter the kind of data you want to get");
        int kindOfData = input.nextInt();

        //copy the arrays from the SourceDataBase

        if (date == 1){
            switch (kindOfData){
                

            }
        }


    }
}








