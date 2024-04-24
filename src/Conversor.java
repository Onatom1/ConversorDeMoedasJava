public class Conversor {

    public static double converterRealParaDolar(APIReader apiReader, double valorReal) {
        double taxaRealParaDolar = apiReader.getTaxaDeCambio("USD");
        System.out.println("Taxa de câmbio de Real para Dólar: " + taxaRealParaDolar);
        return valorReal * taxaRealParaDolar;
    }

    public static double converterDolarParaReal(APIReader apiReader, double valorDolar) {
        double taxaDolarParaReal = apiReader.getTaxaDeCambio("USD");
        System.out.println("Taxa de câmbio de Dólar para Real: " + taxaDolarParaReal);
        return valorDolar / taxaDolarParaReal;
    }


    public static double converterRealParaEuro(APIReader apiReader, double valorReal) {
        double taxaRealParaEuro = apiReader.getTaxaDeCambio("EUR");
        System.out.println("Taxa de câmbio de Real para Euro: " + taxaRealParaEuro);
        return valorReal * taxaRealParaEuro;
    }

    public static double converterEuroParaReal(APIReader apiReader, double valorEuro) {
        double taxaEuroParaReal = apiReader.getTaxaDeCambio("EUR");
        System.out.println("Taxa de câmbio de Euro para Real: " + taxaEuroParaReal);
        return valorEuro / taxaEuroParaReal;
    }


    public static double converterRealParaIene(APIReader apiReader, double valorReal) {
        double taxaRealParaIene = apiReader.getTaxaDeCambio("JPY");
        System.out.println("Taxa de câmbio de Real para Iene: " + taxaRealParaIene);
        return valorReal * taxaRealParaIene;
    }

    public static double converterIeneParaReal(APIReader apiReader, double valorIene) {
        double taxaIeneParaReal = apiReader.getTaxaDeCambio("JPY");
        System.out.println("Taxa de câmbio de Iene para Real: " + taxaIeneParaReal);
        return valorIene / taxaIeneParaReal;
    }


    public static double converterDolarParaIene(APIReader apiReader, double valorDolar) {
        double taxaDolarParaIene = apiReader.getTaxaDeCambio("JPY");
        System.out.println("Taxa de câmbio de Dólar para Iene: " + taxaDolarParaIene);
        return valorDolar * taxaDolarParaIene;
    }

    public static double converterIeneParaDolar(APIReader apiReader, double valorIene) {
        double taxaIeneParaDolar = 1 / apiReader.getTaxaDeCambio("JPY");
        System.out.println("Taxa de câmbio de Iene para Dólar: " + taxaIeneParaDolar);
        return valorIene * taxaIeneParaDolar;
    }
}
