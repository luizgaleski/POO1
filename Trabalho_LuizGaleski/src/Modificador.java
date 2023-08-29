/**
 * Interface que define o contrato para classes que modificam palavras.
 */
public interface Modificador {

    /**
     * Modifica uma palavra de acordo com a implementação da classe.
     *
     * @param palavra A palavra a ser modificada.
     * @return A palavra modificada.
     */

    String modificar(String palavra);
}
