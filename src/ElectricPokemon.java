import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    private final static String TYPE = "electric";

    public static String special = "";

    List<String> attacks = Arrays.asList("thunderPunch","electroBall","thunder","voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name,level,hp,food,sound, TYPE);
    }

    List<String> getAttacks() {
        return attacks;
    }
    void thunderPunch(Pokemon name, Pokemon enemy){

    }
    void electroBall(Pokemon name, Pokemon enemy){

    }

    void thunder(Pokemon name, Pokemon enemy){
        special = "thunder";

    }
    void voltTackle(Pokemon name, Pokemon enemy){

    }
}
