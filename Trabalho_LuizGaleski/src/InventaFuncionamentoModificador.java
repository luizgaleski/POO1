import java.util.Random;

/**
 * Classe responsável por fornecer uma instância de FuncionamentoModificador aleatória.
 */

public class InventaFuncionamentoModificador {
    private FuncionamentoModificador[] funcionamentos = {
            // ... (lista de instâncias de classes FuncionamentoModificador)
            new MaximoQuatroTentativas()
    };

    /**
     * Obtém uma instância de FuncionamentoModificador aleatória.
     *
     * @return Uma instância de FuncionamentoModificador aleatória.
     */

    public FuncionamentoModificador getFuncionamentoModificadorAleatorio() {
        Random random = new Random();
        int index = random.nextInt(funcionamentos.length);
        return funcionamentos[index];
    }
}
