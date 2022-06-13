import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    private final static String TYPE = "water";

    public static String special = "";

    List<String> attacks = Arrays.asList("surf","hydroPump","hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name,level,hp,food,sound, TYPE);
    }

    List<String> getAttacks() {
        return attacks;
    }
    void surf(Pokemon name, Pokemon enemy) {

    }
    void hydroPump(Pokemon name, Pokemon enemy){

    }
    void hydroCanon(Pokemon name, Pokemon enemy){
    }

    void rainDance(Pokemon name, Pokemon enemy){
        special = "rainDance";

    }


}
