import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    private String name;


    FirePokemon charizard = new FirePokemon("charizard", 100, 100, "firefood", "roar");
    WaterPokemon blastoise = new WaterPokemon("blastoise", 100, 100, "waterfood", "roar");
    GrassPokemon venusaur = new GrassPokemon("venusaur", 100, 100, "grassfood", "roar");
    GrassPokemon ditto = new GrassPokemon("ditto", 100, 100, "grassfood", "roar");
    ElectricPokemon raichu = new ElectricPokemon("raichu", 100, 100, "electricfood", "roar");
    WaterPokemon gyarados = new WaterPokemon("gyarados", 100, 100, "waterfood", "roar");
    List<Pokemon> pokemons = Arrays.asList(charizard, blastoise, venusaur, ditto, raichu, gyarados);


    public PokemonTrainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(FirePokemon charizard) {
        this.charizard = charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(WaterPokemon blastoise) {
        this.blastoise = blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(GrassPokemon venusaur) {
        this.venusaur = venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public void setDitto(GrassPokemon ditto) {
        this.ditto = ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(ElectricPokemon raichu) {
        this.raichu = raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(WaterPokemon gyarados) {
        this.gyarados = gyarados;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }
}
