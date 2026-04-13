
import java.util.List;
import java.util.ArrayList;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();
    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
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
        if (getCurrentHealth() == 0) {
            return getName() + " : KO";
        }
        return getName() + " : " + getCurrentHealth() + "/" + getMaxHealth();
    }

    public void takeDamage(int amount) {
        this.currentHealth -= amount;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }

    }

    public void attack(Character obj) {
        obj.takeDamage(9);
    }

     public static  String printStatus() {
                   System.out.println(allCharacters);

        return "------------------------------------------";
    }
      public static  Character fight(Character obj1, Character obj2) {
        return obj1;
    }

    public static void main(String[] args) {
         System.out.print(Character.printStatus());

         Character aragorn = new Character("Aragorn", 20);
         Character uruk = new Character("Uruk", 15);

        System.out.print(Character.printStatus());

       Character winner = Character.fight(aragorn, uruk);

        System.out.println(winner.toString());
        System.out.print(Character.printStatus());
    }
}