public class SourceDataBase {
}

class Weather{
    private String[] weather = {"sunny","cloudy","drizzle","rainstorm","snow","snowstorms"};
    public String[] getWeather() {
        return weather;
    }
    public void setWeather(String[] weather) {
        this.weather = weather;
    }
}

class Temperature{

        double[] temperature = {10.8,8.0,5.0,4.5,8.0,-2.0,-10.0};
        public double[] getTemperature() {
        return temperature;
        }
        public void setTemperature(double[] temperature) {
        this.temperature = temperature;
        }
}

class Windforce{
    int[] windforce = {2,3,2,4,2,3,1};

    public int[] getWindforce() {
        return windforce;
    }

    public void setWindforce(int[] windforce) {
        this.windforce = windforce;
    }
}
class Humidity{

        double[] humidity = {48,83,10.8,15.7,33,9.0,9.9};

    public void setHumidity(double[] humidity) {
        this.humidity = humidity;
    }

    public double[] getHumidity() {
        return humidity;
    }
}

class Barometric{

        String[] barometric = {"1018hpa","1028hpa","1076hpa","1172hpa","1009hpa","1017hpa","1016hpa"};

    public String[] getBarometric() {
        return barometric;
    }

    public void setBarometric(String[] barometric) {
        this.barometric = barometric;
    }
}





