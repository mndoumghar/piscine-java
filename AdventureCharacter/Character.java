public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name,int maxHealth ) {
        this.name= name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;        
    }
    public int getMaxHealth() {
        return maxHealth;
    }
      public int getCurrentHealth() {
        return currentHealth;
    }
  
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (getCurrentHealth()<=0) {
            return getName()+" : KO";
        }
        return getName()+" : "+getCurrentHealth()+ "/" +getMaxHealth();
    }
    public void takeDamage(int amount) {
        this.currentHealth -= amount ;

    } 
    public void attack(Character obj) {
        obj.takeDamage(9);
    }
      

}