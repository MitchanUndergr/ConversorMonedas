public class ConversorMonedas {
    // Constantes de tasas de cambio
    private static final double CAMBIO_DOLAR = 0.0011;
    private static final double CAMBIO_EURO = 0.0010;
    private static final double CAMBIO_LIBRA = 0.00087;
    private static final double CAMBIO_YEN = 0.17;
    private static final double CAMBIO_WON = 1.49;
    private static final double CAMBIO_DOLARP = 917.43;
    private static final double CAMBIO_EUROP = 992.73;
    private static final double CAMBIO_LIBRAP = 1155.12;
    private static final double CAMBIO_YENP = 5.87;
    private static final double CAMBIO_WONP = 0.67;


    public double convertirPesoDolar(double monto) {
        return monto * CAMBIO_DOLAR;
    }

    public double convertirPesoEuro(double monto) {
        return monto * CAMBIO_EURO;
    }

    public double convertirPesoLibraEsterlina(double monto) {
        return monto * CAMBIO_LIBRA;
    }

    public double convertirPesoYen(double monto) {
        return monto * CAMBIO_YEN;
    }

    public double convertirPesoWon(double monto) {
        return monto * CAMBIO_WON;
    }

    public double convertirDolarPeso(double monto) {
        return monto * CAMBIO_DOLARP;
    }

    public double convertirEuroPeso(double monto) {
        return monto * CAMBIO_EUROP;
    }

    public double convertirLibraEsterlinaPeso(double monto) {
        return monto * CAMBIO_LIBRAP;
    }

    public double convertirYenPeso(double monto) {
        return monto * CAMBIO_YENP;
    }

    public double convertirWonPeso(double monto) {
        return monto * CAMBIO_WONP;
    }
}
