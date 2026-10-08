package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return (temperatureCelsius*((double) 9/5)+32);
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f°C (%.1f°F) and %s", temperatureCelsius, temperatureFahrenheit(), conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       double cel=(tempFahrenheit-32)*((double) 5/9);
       WeatherData w1=new WeatherData(cel,conditions);
       return w1;
    }

    public static void main(String[] args) {
        WeatherData today= new WeatherData(25.0,"Sunny");
        WeatherData yesterday= WeatherData.fromFahrenheit(50.0,"Cloudy");
        System.out.println("Today's weather: "+today.getSummary());
        System.out.println("Yesterday's weather: "+yesterday.getSummary());
    }
}
