import java.io.IOException; import java.net.HttpURLConnection; import java.net.URL; import java.util.Scanner;
public class ConversorMoeda {

private static final String API_KEY = "d5096101be22fc3bccd6c54e";

public static double obterTaxaCambio(String moedaBase, String moedaAlvo) throws IOException {
    String urlString = String.format(
        "https://v6.exchangerate-api.com/v6/%s/latest/%s", API_KEY, moedaBase
    );

    URL url = new URL(urlString);
    HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
    conexao.setRequestMethod("GET");

    StringBuilder resposta;
    try (Scanner scanner = new Scanner(conexao.getInputStream())) {
        resposta = new StringBuilder();
        while (scanner.hasNext()) {
            resposta.append(scanner.nextLine());
        }
    }

    JSONObject json = new JSONObject(resposta.toString());
    JSONObject taxas = json.getJSONObject("conversion_rates");

    return taxas.getDouble(moedaAlvo);
}

public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)) {
        System.out.print("Digite a moeda base (ex: USD): ");
        String moedaBase = entrada.next().toUpperCase();

        System.out.print("Digite a moeda alvo (ex: BRL): ");
        String moedaAlvo = entrada.next().toUpperCase();

        System.out.print("Digite o valor a converter: ");
        double valor = entrada.nextDouble();

        double taxa = obterTaxaCambio(moedaBase, moedaAlvo);
        double resultado = valor * taxa;

        System.out.printf("\n%.2f %s equivalem a %.2f %s\n", valor, moedaBase, resultado, moedaAlvo);

    } catch (Exception e) {
        System.out.println("Erro ao converter moeda: " + e.getMessage());
    }
}

}
