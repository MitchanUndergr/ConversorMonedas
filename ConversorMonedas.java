public class ConversorMonedas {
    public double convertirMoneda(String fromCurrency, String toCurrency, double amount) {
        try {
            double rate = APIClient.getExchangeRate(fromCurrency, toCurrency);
            return amount * rate;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
