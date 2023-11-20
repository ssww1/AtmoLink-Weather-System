public class SourceDataBase {
    //arrays of each value,each number stands for one day
    //eg:[0]stands for data of day1
    SourceDataBase() {
        String[] weather = new String[7];
        weather[0] = "晴朗";
        weather[1] = "多云";
        weather[2] = "小雨";
        weather[3] = "暴雨";
        weather[4] = "晴朗";
        weather[5] = "小雪";
        weather[6] = "大雪";


        double[] temperature = new double[7];
        temperature[0] = 10.8;
        temperature[1] = 8.0;
        temperature[2] = 5.0;
        temperature[3] = 4.5;
        temperature[4] = 8.0;
        temperature[5] = -2.0;
        temperature[6] = -10.0;

        int[] windforce = new int[7];
        windforce[0] = 2;
        windforce[1] = 3;
        windforce[2] = 2;
        windforce[3] = 4;
        windforce[4] = 2;
        windforce[5] = 3;
        windforce[6] = 1;

        double[] humidity = new double[7];
        humidity[0] = 4.8;
        humidity[1] = 8.3;
        humidity[2] = 10.8;
        humidity[3] = 15.7;
        humidity[4] = 3.3;
        humidity[5] = 9.0;
        humidity[6] = 9.9;

        String[] barometric = new String[7];
        barometric[0] = "1018hpa";
        barometric[1] = "1028hpa";
        barometric[2] = "1076hpa";
        barometric[3] = "1172hpa";
        barometric[4] = "1009hpa";
        barometric[5] = "1017hpa";
        barometric[6] = "1016hpa";

    }
}


