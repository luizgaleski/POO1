/**
 * Interface que define o contrato para classes que gerenciam o funcionamento do jogo.
 */
public interface FuncionamentoModificador {
    /**
     * Obtém o nome do modo de funcionamento.
     *
     * @return O nome do modo de funcionamento.
     */
    String getNome();

    /**
     * Obtém a descrição do modo de funcionamento.
     *
     * @return A descrição do modo de funcionamento.
     */

    String getDescricao();

    /**
     * Verifica se o jogo foi finalizado.
     *
     * @return True se o jogo foi finalizado, caso contrário, false.
     */
    boolean finalizou();

    /**
     * Verifica se a tentativa do jogador está correta.
     *
     * @param tentativa A palavra tentada pelo jogador.
     * @param palavraCorreta A palavra correta que o jogador deve adivinhar.
     * @return True se a tentativa estiver correta, caso contrário, false.
     */
    boolean acertouPalavra(String tentativa, String palavraCorreta);

    /**
     * Obtém o número de tentativas restantes.
     *
     * @return O número de tentativas restantes.
     */
    int getNumeroTentativas();
    /**
     * Obtém a pontuação final do jogador.
     *
     * @return A pontuação final do jogador.
     */

    int getPontuacaoFinal();
}
