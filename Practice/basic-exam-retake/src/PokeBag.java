public class PokeBag {
    public static void main(String[] args) {
        // Create a PokeBag class that can store multiple pokemons from different types. Add 5 pokemons to your PokeBag.
        // There are 3 kind of pomenons:
        // - Pikachu, who says “Pika-pika” and has 12 HP (health point)
        // - Bubasaur, who says “Bulba-saur” and has 10 HP
        // - Charmander, who says “Char-char” and has 10 HP
        // Every pokemon has a random strength between 1 and 10.
        // Pokemons can say their sound (see above) when their Speak method is called. The Speak method should return the pokemon’s sound.
        // Create a function that returns the pokemon with the highest strength. In case of equal strengths, it’s your choice which one to return.
        //
        // Example:
        // pokeBag.add(new Pikachu());
        // pokeBag.add(new Pikachu());
        // pokeBag.add(new Pikachu());
        // pokeBag.add(new Bulbasaur());
        // pokeBag.add(new Charmander());
        //
        // System.out.println(pokeBag.get(0).speak());
        // This should print Pika-pika
        //
        // Pokemon stongestPokemon = pokeBag.getStrongest();
        // Should return the pokemon with the highest strength value

        Pokemon pokemon = new Pikachu();
        System.out.println(pokemon.strength);
    }
}