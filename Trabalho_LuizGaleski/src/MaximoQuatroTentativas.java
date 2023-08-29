/**
 * Classe que implementa a interface FuncionamentoModificador para um jogo com no máximo quatro tentativas.
 */

public class MaximoQuatroTentativas implements FuncionamentoModificador {
    private int tentativas;
    private int pontuacao;

    public MaximoQuatroTentativas() {
        this.tentativas = 4;
        this.pontuacao = 0;
    }

    @Override
    public String getNome() {
        return "MaximoQuatroTentativas";
    }

    @Override
    public String getDescricao() {
        return "Tente acertar no máximo com 4 tentativas.";
    }

    @Override
    public boolean finalizou() {
        return tentativas == 0;
    }

    @Override
    public boolean acertouPalavra(String tentativa, String palavraCorreta) {
        tentativas--;
        if (tentativa.equals(palavraCorreta)) {
            pontuacao += 10;
            return true;
        }
        return false;
    }

    @Override
    public int getNumeroTentativas() {
        return tentativas;
    }

    @Override
    public int getPontuacaoFinal() {
        return pontuacao;
    }
}
