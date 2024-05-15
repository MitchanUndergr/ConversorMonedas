import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean continuar = false;
        do {
            String[] opcionesInicio = {
                    "Conversor de Temperatura",
                    "Conversor de Monedas"
            };

            // Mostrar el panel de opciones inicial y obtener la opción seleccionada
            String opcionInicio = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Inicio", JOptionPane.QUESTION_MESSAGE, null, opcionesInicio, opcionesInicio[0]);

            if (opcionInicio.equals("Conversor de Temperatura")) {
                // Proceso de conversor de temperatura
                realizarConversionTemperatura();
            } else if (opcionInicio.equals("Conversor de Monedas")) {
                // Proceso de conversor de monedas
                realizarConversionMonedas();
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Preguntar al usuario si desea continuar
            int respuesta = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "No");
            continuar = (respuesta == JOptionPane.YES_OPTION);
        } while (continuar);
    }

    public static void realizarConversionTemperatura() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        String[] opcionesTemperatura = {
                "Convertir de Celsius a Fahrenheit",
                "Convertir de Celsius a Kelvin",
                "Convertir de Fahrenheit a Celsius",
                "Convertir de Fahrenheit a Kelvin",
                "Convertir de Kelvin a Celsius",
                "Convertir de Kelvin a Fahrenheit"
        };

        // Solicitar al usuario la temperatura a convertir
        String temperaturaStr = JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir:", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE);

        // Mostrar el panel de opciones de temperatura y obtener la opción seleccionada
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión de temperatura:", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura, opcionesTemperatura[0]);

        double temperatura = Double.parseDouble(temperaturaStr);

        // Realizar la conversión de temperatura según la opción seleccionada
        double resultado = 0;
        switch (opcionSeleccionada) {
            case "Convertir de Celsius a Fahrenheit":
                resultado = conversor.convertirCelsiusAFahrenheit(temperatura);
                break;
            case "Convertir de Celsius a Kelvin":
                resultado = conversor.convertirCelsiusAKelvin(temperatura);
                break;
            case "Convertir de Fahrenheit a Celsius":
                resultado = conversor.convertirFahrenheitACelsius(temperatura);
                break;
            case "Convertir de Fahrenheit a Kelvin":
                resultado = conversor.convertirFahrenheitAKelvin(temperatura);
                break;
            case "Convertir de Kelvin a Celsius":
                resultado = conversor.convertirKelvinACelsius(temperatura);
                break;
            case "Convertir de Kelvin a Fahrenheit":
                resultado = conversor.convertirKelvinAFahrenheit(temperatura);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }

        // Mostrar el resultado de la conversión de temperatura
        JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado, "Conversión de Temperatura", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void realizarConversionMonedas() {
        ConversorMonedas conversor = new ConversorMonedas();
        double monto;

        do {
            // Solicitar al usuario la cantidad de dinero a convertir
            String montoStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero a convertir:", "Conversor de Monedas", JOptionPane.QUESTION_MESSAGE);

            // Convertir el monto a double
            monto = Double.parseDouble(montoStr);

            // Verificar si el monto es positivo
            if (monto < 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad positiva.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (monto < 0);

        String[] opcionesMonedas = {
                "Convertir de peso a dolar",
                "Convertir de peso a euro",
                "Convertir de peso a libra esterlina",
                "Convertir de peso a won",
                "Convertir de peso a yen",
                "Convertir de dolar a peso",
                "Convertir de euro a peso",
                "Convertir de libra esterlina a peso",
                "Convertir de won a peso",
                "Convertir de yen a peso"
        };

        // Mostrar el panel de opciones de monedas y obtener la opción seleccionada
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión de monedas:", "Conversor de Monedas", JOptionPane.QUESTION_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);

        // Realizar la conversión de monedas según la opción seleccionada
        double resultado = 0;
        switch (opcionSeleccionada) {
            case "Convertir de peso a dolar":
                resultado = conversor.convertirPesoDolar(monto);
                break;
            case "Convertir de peso a euro":
                resultado = conversor.convertirPesoEuro(monto);
                break;
            case "Convertir de peso a libra esterlina":
                resultado = conversor.convertirPesoLibraEsterlina(monto);
                break;
            case "Convertir de peso a won":
                resultado = conversor.convertirPesoWon(monto);
                break;
            case "Convertir de peso a yen":
                resultado = conversor.convertirPesoYen(monto);
                break;
            case "Convertir de dolar a peso":
                resultado = conversor.convertirDolarPeso(monto);
                break;
            case "Convertir de euro a peso":
                resultado = conversor.convertirEuroPeso(monto);
                break;
            case "Convertir de libra esterlina a peso":
                resultado = conversor.convertirLibraEsterlinaPeso(monto);
                break;
            case "Convertir de won a peso":
                resultado = conversor.convertirWonPeso(monto);
                break;
            case "Convertir de yen a peso":
                resultado = conversor.convertirYenPeso(monto);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }

        // Mostrar el resultado de la conversión de monedas
        JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado, "Conversión de Monedas", JOptionPane.INFORMATION_MESSAGE);
    }
}
