import java.util.*;

public interface PokemonGym {
    public void enteredTheGym(PokemonTrainer player1);

    public void printPokemon(List<Pokemon> pokemons);




    public Pokemon selectPokemon(String pokemon, PokemonTrainer trainer);
    public void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon);

    public Pokemon chooseGymPokemon(PokemonGymOwner gymOwner);
    public Pokemon choosePokemon(PokemonTrainer trainer);

    public int randomAttackByGymOwner();

    public String chooseAttackPlayer(Pokemon p);
    public void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack);
    public void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon);
    public void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym);

}


