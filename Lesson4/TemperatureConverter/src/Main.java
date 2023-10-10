public class Main {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println("30C to F --> " + temperatureConverter.toFahrenheit(30));
        System.out.println("86F to C --> " + temperatureConverter.toCelsius(86));
    }
}