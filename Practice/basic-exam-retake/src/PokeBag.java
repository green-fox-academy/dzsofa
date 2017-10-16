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


}