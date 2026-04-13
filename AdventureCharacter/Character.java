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
        this.currentHealth -= amount ;

    } 
    public void attack(Character obj) {
        obj.takeDamage(9);
    }
       public static void main(String[] args) {
        Character aragorn = new Character("Aragorn", 20);
        Character uruk = new Character("Uruk", 5);
        
        System.out.println(aragorn.toString());
        System.out.println(uruk.toString());
        
        aragorn.attack(uruk);

        System.out.println(uruk.toString());
        
        aragorn.takeDamage(12);

        System.out.println(aragorn.toString());
    }


}