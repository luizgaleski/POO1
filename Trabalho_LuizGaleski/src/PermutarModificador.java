import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe que implementa a interface Modificador para permutar letras de uma palavra.
 */

public class PermutarModificador implements Modificador {

    /**
     * Permuta aleatoriamente as letras de uma palavra.
     *
     * @param palavra A palavra a ser permutada.
     * @return A palavra com letras permutadas.
     */

    @Override
    public String modificar(String palavra) {
        List<Character> chars = new ArrayList<>();
        for (char c : palavra.toCharArray()) {
            chars.add(c);
        }
        Collections.shuffle(chars);
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }
        return result.toString();
    }
}