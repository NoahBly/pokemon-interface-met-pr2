import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    private final static String TYPE = "fire";
    public static String special = "";

    List<String> attacks = Arrays.asList("firelash","flameThrower","pyroBall", "inferno");
    List<String> getAttacks() {
        return attacks;
    }
   public FirePokemon (String name, int level, int hp, String food, String sound) {
   super(name,level,hp,food,sound, TYPE);

    }


    void fireLash(Pokemon name, Pokemon enemy){
    }

    void flameThrower(Pokemon name, Pokemon enemy){
    special = "flamethrower";
    }
    void pyroBall(Pokemon name, Pokemon enemy){

    }
    void inferno(Pokemon name, Pokemon enemy){

    }
}

