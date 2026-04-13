public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name,int maxHealth ) {
        this.name= name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;        
    }
    public int getMAx() {
        return maxHealth;
    }
      public int getCuurent() {
        return currentHealth;
    }
  
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (getCuurent()<=0) {
            return getName()+" : KO";
        }
        return getName()+" : "+getCuurent()+ "/" +getMAx();
    }
    public void takeDamage(int amount) {
        this.currentHealth =   getCuurent() -amount ;

    } 
    public void attack(Character obj) {
        obj.takeDamage(9);
    }
     


}