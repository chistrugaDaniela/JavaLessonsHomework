public class TemperatureConverter {

    public double toCelsius(double temperature) {
        double temperatureToC = (5 * (temperature - 32)) / 9;
        return temperatureToC;
    }

    public double toFahrenheit(double temperature) {
        double temperatureToF = (9 * temperature + (32 * 5)) / 5;
        return temperatureToF;
    }


}
