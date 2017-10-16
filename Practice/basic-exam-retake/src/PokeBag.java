import java.util.ArrayList;
import java.util.Collections;

public class PokeBag {
    ArrayList<Pokemon> pokemons;

    public PokeBag() {
        pokemons = new ArrayList<Pokemon>();
    }

    public void add(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public Pokemon get(int index) {
        return pokemons.get(index);
    }

    public Pokemon getStrongest() {
        Pokemon strongest;
        Collections.sort(pokemons);
        strongest = pokemons.get(pokemons.size() - 1);
        return strongest;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Your PokeBall contains the following Pokemons: \n");
        for (int i = 0; i < pokemons.size(); i++) {
            sb.append(pokemons.get(i).toString());
            sb.append("\n");
        }
        sb.append("Catch'em all!");
        return sb.toString();
    }
}