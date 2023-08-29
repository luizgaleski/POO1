import java.util.Random;

/**
 * Classe responsável por fornecer uma instância de Modificador aleatória.
 */

public class InventaModificador {
    private Modificador[] modificadores = {

            // ... (lista de instâncias de classes Modificador)
            new InverterModificador(),
            new PermutarModificador()
    };

    /**
     * Obtém uma instância de Modificador aleatória.
     *
     * @return Uma instância de Modificador aleatória.
     */

    public Modificador getModificadorAleatorio() {
        Random random = new Random();
        int index = random.nextInt(modificadores.length);
        return modificadores[index];
    }
}
