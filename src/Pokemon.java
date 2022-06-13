public class Pokemon {

    /*Class and interfaces cannot be private. Variables that are declared private can be accessed outside the class, if public getter methods are present in the class. Using the private modifier is the main way that an object encapsulates itself and hides data from the outside world.*/

    private int level;
     private int hp;
     private String food;
     private String sound;

    private String name;

    private String type;



     public Pokemon( String name, int level, int hp, String food, String sound, String type) {
         this.name = name;
         this.level = level;
       this.hp = hp;
       this.food = food;
       this.sound = sound;
       this.type = type;

     }

     public int getLevel() {
          return level;
     }

     public int getHp() {
          return hp;
     }

     public String getFood() {
          return food;
     }

     public String getSound() {
          return sound;
     }

    public String getName() {
        return name;
    }

    public String getType() {
         return type;
    }

    public void setLevel(int level) {
          this.level = level;
     }

     public void setHp(int hp) {
          this.hp = hp;
     }

     public void setFood(String food) {
          this.food = food;
     }

     public void setSound(String sound) {
          this.sound = sound;
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
