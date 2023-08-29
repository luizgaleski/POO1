import java.util.Scanner;

/**
 * Esta classe representa um jogo de adivinhação de palavras confusas.
 * O jogador deve tentar adivinhar a palavra correta que foi modificada.
 */

public class ClassePrincipal {

    /**
     * O método principal que inicia o jogo de adivinhação.
     *
     * @param args Argumentos de linha de comando (não utilizados neste caso).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();
        InventaModificador inventaModificador = new InventaModificador();
        InventaFuncionamentoModificador inventaFuncionamentoModificador = new InventaFuncionamentoModificador();

        String palavraCorreta = conjuntoPalavras.getPalavraAleatoria();
        Modificador modificador = inventaModificador.getModificadorAleatorio();
        String palavraConfusa = modificador.modificar(palavraCorreta);

        FuncionamentoModificador funcionamentoModificador = inventaFuncionamentoModificador.getFuncionamentoModificadorAleatorio();
        System.out.println(funcionamentoModificador.getNome());
        System.out.println(funcionamentoModificador.getDescricao());

        while (!funcionamentoModificador.finalizou()) {
            System.out.println("Palavra confusa: " + palavraConfusa);
            System.out.print("Tente adivinhar a palavra: ");
            String tentativa = scanner.nextLine();

            if (funcionamentoModificador.acertouPalavra(tentativa, palavraCorreta)) {
                System.out.println("Parabéns! Você acertou a palavra.");
                break;
            } else {
                System.out.println("Palavra incorreta. Tentativas restantes: " + funcionamentoModificador.getNumeroTentativas());
            }
        }

        System.out.println("Pontuação final: " + funcionamentoModificador.getPontuacaoFinal());
    }
}
