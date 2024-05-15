public class ConversorTemperatura {
    public double convertirCelsiusAFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }

    public double convertirCelsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertirFahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public double convertirFahrenheitAKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9;
    }

    public double convertirKelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double convertirKelvinAFahrenheit(double kelvin) {
        return kelvin * 9/5 - 459.67;
    }
}
