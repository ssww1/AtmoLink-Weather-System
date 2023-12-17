import src.*;

import java.util.Scanner;

/**
 *
 * @author Chriles
 * @version 1.2.0
 *
 */
public class Assessment {
    public static void main(String[] args) {
        Weather weatherData = new Weather();
        Temperature temperatureData = new Temperature();
        Windforce windforceData = new Windforce();
        Humidity humidityData = new Humidity();
        Barometric barometricData = new Barometric();

        Scanner input = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("""
                    Do you want something weather advice about today? (y/n)
                    including: clothingRecommendation, sportRecommendation,
                    HealthAssessment, CarWashIndex, DryingIndex, ExerciseIndex.
                     """);
            String answer = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("What day do you want weather advice on?");
                int day = input.nextInt();

                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        System.out.println("In the " + day + " day, We have some suggestion like :");

                        // Clothing recommendation
                        String clothingRecommendation = getClothingRecommendation(temperatureData.getTemperature()[day - 1]);
                        System.out.println("Clothing Recommendation: " + clothingRecommendation);

                        // Sport recommendation
                        String sportRecommendation = getSportRecommendation(weatherData.getWeather()[day - 1]);
                        System.out.println("Sport Recommendation: " + sportRecommendation);

                        // Health assessment
                        String healthAssessment = getHealthAssessment(temperatureData.getTemperature()[day - 1], humidityData.getHumidity()[day - 1]);
                        System.out.println("Health Assessment: " + healthAssessment);

                        // Car wash index
                        int carWashIndex = getCarWashIndex(weatherData.getWeather()[day - 1]);
                        System.out.println("Car Wash Index: " + carWashIndex);

                        // Drying index
                        int dryingIndex = getDryingIndex(weatherData.getWeather()[day - 1]);
                        System.out.println("Drying Index: " + dryingIndex);

                        // Exercise index
                        int exerciseIndex = getExerciseIndex(temperatureData.getTemperature()[day - 1], windforceData.getWindforce()[day - 1]);
                        System.out.println("Exercise Index: " + exerciseIndex);

                        System.out.print("................................................");
                        System.out.println();

                        break;
                    default: System.out.println("Invalid day. Please enter a day between 1 and 7.");
                }
            } else if (answer.equals("n")) {
                System.out.println("Sorry to bother you");
                continueProgram = false;

            } else {
                System.out.println("Please enter y/n");
            }
            input.nextLine();

            // Ask the user if they want to continue
            System.out.print("Do you want to continue? (y/n): ");
            String continueAnswer = input.nextLine();
            if (!continueAnswer.equals("y")) {
                continueProgram = false;
            }
        }
    }

    private static String getClothingRecommendation ( double temperature){
            String clothingRecommendation;
            if (temperature < 5) {
                clothingRecommendation = "Wear heavy winter clothes";
            } else if (temperature < 15) {
                clothingRecommendation = "Wear a jacket or sweater";
            } else {
                clothingRecommendation = "Light clothing is sufficient";
            }
            return clothingRecommendation;
        }

        private static String getSportRecommendation (String weather){
            String sportRecommendation;
            if (weather.equals("rainstorm") || weather.equals("windy")) {
                sportRecommendation = "Indoor sports are recommended";
            } else {
                sportRecommendation = "Outdoor sports are suitable";
            }
            return sportRecommendation;
        }

        private static String getHealthAssessment ( double temperature, double humidity){
            String HealthAssessment;
            if (temperature > 25 && humidity > 80) {
                HealthAssessment = "Extremely inappropriate to go out";
            } else if (temperature < 5 && humidity < 30) {
                HealthAssessment = "Pay attention to protection yourself is important";
            } else {
                HealthAssessment = "Temperatures are normal. Travel is scheduled";
            }
            return HealthAssessment;
        }

        private static int getCarWashIndex (String weather){
            int CarWashIndex;
            if (weather.equals("rainstorm") || weather.equals("snowstorms")) {
                CarWashIndex = 1;
                System.out.println(" Not recommended to wash the car in heavy rain or snow.");
            } else {
                CarWashIndex = 5;
                System.out.println("Washing the car is fine in this weather conditions.");
            }
            return CarWashIndex;
        }

        private static int getDryingIndex (String weather){
            int DryingIndex;
            if (weather.equals("rainstorm") || weather.equals("snowstorms")) {
                DryingIndex = 1;
                System.out.println("Not recommended to dry clothes outside in today");
            } else {
                DryingIndex = 4;
                System.out.println("Drying clothes outside is generally fine in this weather conditions.");
            }
            return DryingIndex;
        }

        private static int getExerciseIndex ( double temperature, int windforce){
            int ExerciseIndex;
            if (temperature > 20 && windforce < 3) {
                ExerciseIndex = 5;
                System.out.println("Perfect conditions for outdoor exercise.");
            } else if (temperature > 10) {
                ExerciseIndex = 3;
                System.out.println("Suitable for outdoor exercise");
            } else {
                ExerciseIndex = 2;
                System.out.println("Consider indoor exercise due to cold weather.");
            }
            return ExerciseIndex;

        }
    }






