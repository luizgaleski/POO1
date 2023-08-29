/**
 * Classe que implementa a interface Modificador para inverter palavras.
 */
public class InverterModificador implements Modificador {

    /**
     * Inverte uma palavra.
     *
     * @param palavra A palavra a ser invertida.
     * @return A palavra invertida.
     */

    @Override
    public String modificar(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }
}