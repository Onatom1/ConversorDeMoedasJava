import java.io.IOException;

public class ConversorMoedas {
    public static void main(String[] args) throws IOException, InterruptedException {
        APIReader apiReader = new APIReader();
        Menu menu = new Menu();

        while (true) {
            menu.mostrarOpcoes();
            int opcao = menu.lerOpcao();
            menu.executarOpcao(opcao, apiReader);
        }
    }
}
