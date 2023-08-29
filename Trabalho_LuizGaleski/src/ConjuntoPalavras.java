import java.util.Random;

/**
 * Classe responsável por fornecer palavras aleatórias para o jogo.
 */

public class ConjuntoPalavras {

    /**
     * Obtém uma palavra aleatória do conjunto de palavras.
     *
     * @return Uma palavra aleatória.
     */

    private String[] palavras = {
            "amarelo", "verde", "azul", "rosa", "roxo",
            "branco", "preto", "marrom", "cinza", "laranja"
    };

    public String getPalavraAleatoria() {
        Random random = new Random();
        int index = random.nextInt(palavras.length);
        return palavras[index];
    }
}
